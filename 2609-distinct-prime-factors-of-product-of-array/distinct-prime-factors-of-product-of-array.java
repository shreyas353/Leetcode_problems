class Solution {
    public int distinctPrimeFactors(int[] nums) {
        return countFactors(nums);
    }
    public int countFactors(int[] nums){
        int count=0;
        for(int i=2;i<=1000;i++){
            if(isPrime(i) && IsPrimeFactor(nums,i)){
                count++;
            }
        }
        return count;
    }
    public boolean IsPrimeFactor(int[] nums, int factor){
        for(int i=0;i<nums.length;i++){
            if(nums[i]%factor==0){
                return true;
            }
        }
        return false;
    }
    public boolean isPrime(int n){
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}