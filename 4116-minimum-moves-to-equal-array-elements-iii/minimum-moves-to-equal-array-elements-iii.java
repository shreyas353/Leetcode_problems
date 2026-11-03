class Solution {
    public int minMoves(int[] nums) {
        int max=nums[0];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            max=Math.max(max, nums[i]);
            sum=sum+nums[i];
        }
        int res=max*nums.length-sum;
        return res;
    }
}