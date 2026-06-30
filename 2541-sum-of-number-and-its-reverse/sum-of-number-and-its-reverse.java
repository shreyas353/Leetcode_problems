class Solution {
    public boolean sumOfNumberAndReverse(int num) {
        for(int i=0;i<=num;i++){
            int reverse=DigitReverse(i);
            if(i+reverse==num){
                return true;
            }
        }
        return false;
    }
    public static int DigitReverse(int n){
        int reverse=0;
        while(n!=0){
            int digits=n%10;
            reverse=reverse*10+digits;
            n=n/10;
        }
        return reverse;
    }
}