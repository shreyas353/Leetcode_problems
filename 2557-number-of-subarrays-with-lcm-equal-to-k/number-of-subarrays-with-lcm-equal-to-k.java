class Solution {
    public int subarrayLCM(int[] nums, int k) {
        int res=0;
        for(int i=0;i<nums.length;i++){
            int ques=nums[i];
            for(int j=i;j<nums.length;j++){
                ques=lcm(ques,nums[j]);
                if(ques==k){
                    res++;
                }
                if(ques>k||k%ques!=0){
                    break;
                }
            }
        }
        return res;
    }
    public int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
    public int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b,a%b);
    }
}