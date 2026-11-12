class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int result[]=new int[nums.length];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        }
        int leftsum=0;
        for(int i=0;i<nums.length;i++){
            int rightsum=sum-nums[i]-leftsum;
            int left=nums[i]*i-leftsum;
            int right=rightsum-nums[i]*(nums.length-i-1);
            result[i]=left+right;
            leftsum=leftsum+nums[i];
        }
        return result;
    }
}