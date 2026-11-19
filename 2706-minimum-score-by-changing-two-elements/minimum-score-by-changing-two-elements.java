class Solution {
    public int minimizeSum(int[] nums) {
        Arrays.sort(nums);
        int case1=nums[nums.length-1]-nums[2];
        int case2=nums[nums.length-2]-nums[1];
        int case3=nums[nums.length-3]-nums[0];
        return Math.min(case1,Math.min(case2,case3));
    }
}