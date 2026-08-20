class Solution {
    public void inpOut(List<List<Integer>> ans,List<Integer> inp,List<Integer> out,int target){
         if(target < 0) return;
        if(target == 0){
           if(!ans.contains(out))  ans.add(new ArrayList<>(out));
            return;
        }
       
        for(int i = 0;i < inp.size();i++){
            List<Integer> inpN = new ArrayList<>(inp);
            List<Integer> outN = new ArrayList<>(out);
             if(i > 0 && inp.get(i).equals(inp.get(i-1))) continue;
             outN.add(inpN.get(i));
             int val = inpN.get(i);
              inpN.subList(0,i+1).clear();
             inpOut(ans,inpN,outN,target-val);
            
        }
    }
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
       List<Integer> inp = new ArrayList<>();
       for(int ele:nums){
        inp.add(ele);
       }
       inpOut(ans,inp,new ArrayList<>(),target);
        return ans;
    }
}