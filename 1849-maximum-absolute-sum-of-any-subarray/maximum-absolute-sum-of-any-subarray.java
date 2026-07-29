class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int max_ending=nums[0];
        int min_ending=nums[0];
        int ans=Math.abs(nums[0]);
        for(int i=1;i<nums.length;i++){
            max_ending=Math.max(max_ending+nums[i],nums[i]);
            min_ending=Math.min(min_ending+nums[i],nums[i]);
            ans=Math.max(Math.max(ans,max_ending),Math.abs(min_ending));
        }
        return ans;
    }
}