class Solution {
    public long sumAndMultiply(int n) {
        long result=0;
        long place=1;
        while(n!=0){
            long digits=n%10;
            if(digits!=0){
                result=result+digits*place;
                place=place*10;
            }
            n=n/10;
        }
        return result*sumDigit(result);
    }
    public static long sumDigit(long n){
        long sum=0;
        while(n!=0){
            long digits=n%10;
            sum=sum+digits;
            n=n/10;
        }
        return sum;
    }
}