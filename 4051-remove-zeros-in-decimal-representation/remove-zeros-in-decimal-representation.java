class Solution {
    public long removeZeros(long n) {
        long res=0;
        long a=1;
        while(n!=0){
            long digits=n%10;
            if(digits!=0){
                res=res+digits*a;
                a=a*10;
            }
            n=n/10;
        }
        return res;
    }
}