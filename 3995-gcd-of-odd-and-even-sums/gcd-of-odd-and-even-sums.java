class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumEven=0;
        int sumOdd=0;
        for(int i=1;i<=n;i++){
            sumEven=sumEven+(2*i);
            sumOdd=sumOdd+(2*i-1);
        }
        return Gcd(sumOdd,sumEven);
    }
    public static int Gcd(int a,int b){
        if(b==0){
            return a;
        }
        return Gcd(b,a%b);
    }
}