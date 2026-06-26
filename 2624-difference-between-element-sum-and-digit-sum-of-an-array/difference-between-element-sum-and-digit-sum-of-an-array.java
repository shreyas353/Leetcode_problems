class Solution {
    public int differenceOfSum(int[] nums) {
        return Math.abs(ElementSum(nums)-DigitSum(nums));
    }
    public static int ElementSum(int[] nums){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        }
        return sum;
    }
    public static int DigitSum(int[] nums){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            while (n>0){
                int digits=n%10;
                sum=sum+digits;
                n=n/10;
            }
        }
        return sum;
    }
}