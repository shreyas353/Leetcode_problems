class Solution {
    public int maxLength(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            long product=1;
            long gcd=0;
            long lcm=1;
            for(int j=i;j<nums.length;j++){
                product=product*nums[j];
                gcd=gcd(gcd,nums[j]);
                lcm=lcm(lcm,nums[j]);
                if(product==(gcd*lcm)){
                    ans=Math.max(ans,j-i+1);
                }
            }
        }
        return ans;
    }
    public static long gcd(long a,long b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
    public static long lcm(long a,long b){
        if(a==0||b==0){
            return 0;
        }
        return (a*b)/gcd(a, b);
    }
}