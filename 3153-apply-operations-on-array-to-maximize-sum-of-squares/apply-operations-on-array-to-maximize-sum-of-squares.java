class Solution {
    public int maxSum(List<Integer> nums, int k) {
        int[] bits=new int[31];
        int mod=1000000007;
        for(int i=0;i<nums.size();i++) {
            int num=nums.get(i);
            for(int j=0;j<31;j++) {
                if((num&(1<<j))!=0){
                    bits[j]++;
                }
            }
        }
        long sum=0;
        for(int i=0;i<k;i++){
            long num=0;
            for(int j=30;j>=0;j--){
                if(bits[j]>0){
                    num|=(1L<<j);
                    bits[j]--;
                }
            }
            sum=(sum+num*num)%mod;
        }
        return (int) sum;
    }
}