public class Leetcode3702q {
    public int longestSubsequence(int[] nums) {
        int xor = 0;
        boolean Allzero = true;
        for(int ele:nums){
            xor = xor ^ ele;
            if(ele != 0){
                Allzero =false;
            }
        }
        if(xor !=0) return nums.length;
        if(Allzero) return 0;
        return nums.length -1;
    }
}

