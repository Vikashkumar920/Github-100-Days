import java.util.*;

public class Main {

    public static int maximumLengthSubstring(String s) {
        int maxLen = 0;
        int k = 2;
        int i = 0;

        Map<Character, Integer> map = new HashMap<>();

        for (int j = 0; j < s.length(); j++) {
            char ch = s.charAt(j);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            while (map.get(ch) > k) {
                char left = s.charAt(i);

                map.put(left, map.get(left) - 1);

                if (map.get(left) == 0) {
                    map.remove(left);
                }

                i++;
            }

            maxLen = Math.max(maxLen, j - i + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println(maximumLengthSubstring(s));

        sc.close();
    }
}