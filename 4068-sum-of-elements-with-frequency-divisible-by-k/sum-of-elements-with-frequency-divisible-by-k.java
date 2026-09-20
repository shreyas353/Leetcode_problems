class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            int first=0;
            for(int j=0;j<i;j++){
                if(nums[i]==nums[j]){
                    first++;
                }
            }
            if(first==0 && count%k==0){
                sum=sum+nums[i]*count;
            }
        }
        return sum;
    }
}