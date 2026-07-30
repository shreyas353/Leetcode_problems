class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int best_max_ending=nums[0];
        int best_min_ending=nums[0];
        int max_sum=nums[0];
        int min_sum=nums[0];
        int res=nums[0];
        for(int i=1;i<nums.length;i++){
            res=res+nums[i];
            best_max_ending=Math.max(best_max_ending+nums[i],nums[i]);
            max_sum=Math.max(max_sum,best_max_ending);
            best_min_ending=Math.min(best_min_ending+nums[i],nums[i]);
            min_sum=Math.min(min_sum,best_min_ending);
        }
        return max_sum<0?max_sum:Math.max(max_sum,res-min_sum);
    }
}