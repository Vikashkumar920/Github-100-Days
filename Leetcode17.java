class Solution {
    static List<String> ans;
    public void fun(int i,String s,StringBuilder tmp,Map<Integer,String> map){
        if(i >= s.length()){
            ans.add(tmp.toString());
            return;
        }
        int curr = s.charAt(i)-'0';
        String t = map.get(curr);
        for(int j = 0;j < t.length();j++){
            tmp.append(t.charAt(j));
            fun(i+1,s,tmp,map);
            tmp.deleteCharAt(tmp.length()-1);
        }
    }
    public List<String> letterCombinations(String s) {
       
        Map<Integer,String> map = new HashMap<>();
        map.put(2,"abc");
        map.put(3,"def");
        map.put(4,"ghi");
        map.put(5,"jkl");
        map.put(6,"mno");
        map.put(7,"pqrs");
        map.put(8,"tuv");
        map.put(9,"wxyz");
         ans = new ArrayList<>();
        fun(0,s,new StringBuilder(),map);
     return ans;
    }
}