class Solution {
    public int subarraySum(int[] nums) {
        int prefix[]=new int[nums.length+1];
        prefix[0]=0;
        int ans=0;
        for(int i=1;i<=nums.length;i++){
            prefix[i]=prefix[i-1]+nums[i-1];
        }
        for(int i=0;i<nums.length;i++){
            ans=ans+prefix[i+1]-prefix[Math.max(0,i-nums[i])];
        }
        return ans;
    }
}