class Solution {
    public int countPartitions(int[] nums) {
        int sum=0;
        int left=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        }
        for(int i=0;i<nums.length-1;i++){
            left=left+nums[i];
            int right=sum-left;
            if((left-right)%2==0){
                count++;
            }
        }
        return count;
    }
}