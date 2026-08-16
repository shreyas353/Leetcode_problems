import java.util.HashMap;
class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int sum=0;
        int res=0;
        HashMap <Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            int ques=sum-goal;
            res=res+map.getOrDefault(ques,0);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return res;
    }
}