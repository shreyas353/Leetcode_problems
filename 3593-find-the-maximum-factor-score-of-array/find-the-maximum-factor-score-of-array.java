class Solution {
    public long maxScore(int[] nums) {
        long max=0;
        max=Math.max(max,calculate(nums,-1));
        for(int i=0;i<nums.length;i++){
            max=Math.max(max,calculate(nums,i));
        }
        return max;
    }
    public long calculate(int[] nums,int skip){
        long g=0;
        long l=1;
        for(int i=0;i<nums.length;i++){
            if(i==skip){
                continue;
            }
            g=gcd(g,nums[i]);
            l=lcm(l,nums[i]);
        }
        return g*l;
    }
    public long gcd(long a,long b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
    public long lcm(long a,long b){
        return (a/gcd(a,b))*b;
    }
}