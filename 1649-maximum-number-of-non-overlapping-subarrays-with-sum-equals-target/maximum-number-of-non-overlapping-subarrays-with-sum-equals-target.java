class Solution {
    public int maxNonOverlapping(int[] nums, int target) {
        int sum=0;
        int res=0;
        HashMap <Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            int ques=sum-target;
            if(map.containsKey(ques)){
                res++;
                sum=0;
                map.clear();
                map.put(0,1);
            }
            else{
                map.put(sum,map.getOrDefault(sum,0)+1);
            }
        }
        return res;
    }
}