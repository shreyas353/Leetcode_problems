class Solution {
    public int concatenatedBinary(int n) {
        long mod=1000000007;
        long sum=0;
        for(int i=1;i<=n;i++){
            String binary=Integer.toBinaryString(i);
            int bits=binary.length();
            sum=(sum*(long)Math.pow(2,bits)+i)%mod;
        }
        return (int) sum;
    }
}