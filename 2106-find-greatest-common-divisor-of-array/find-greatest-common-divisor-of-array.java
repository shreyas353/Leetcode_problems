class Solution {
    public int findGCD(int[] nums) {
        int largest = nums[0];
        int smallest = nums[0];
        for (int i = 1; i < nums.length; i++) {
            largest = Math.max(largest, nums[i]);
            smallest = Math.min(smallest, nums[i]);
        }
        return gcd(largest,smallest);
    }
    public static int gcd(int a,int b){
        if (b == 0){
            return a;
        }
        return gcd(b, a % b); 
    }
}