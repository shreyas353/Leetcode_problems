class Solution {
    public int sumOfPrimesInRange(int n) {
        int r=Reverse(n);
        int sum=0;
        int start=Math.min(n,r);
        int end=Math.max(n,r);
        for(int i=start;i<=end;i++){
            if(isPrime(i)){
                sum=sum+i;
            }
        }
        return sum;
    }
    public static int Reverse(int n){
        int reverse=0;
        while(n!=0){
            int digits=n%10;
            reverse=reverse*10+digits;
            n=n/10;
        }
        return reverse;
    }
    public static boolean isPrime(int n) {
        if(n<2){
            return false;
        }
        if(n==2){
            return true;
        }
        if(n%2==0){
            return false;
        }
        for(int i=3;i*i<=n;i=i+2){
            if(n%i==0) {
                return false;
            }
        }
        return true;
    }
}