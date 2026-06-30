class Solution {
    public boolean sumOfNumberAndReverse(int num) {
        for(int i=num/2;i<=num;i++){
            if(i+DigitReverse(i)==num){
                return true;
            }
        }
        return false;
    }
    public static int DigitReverse(int n){
        int reverse=0;
        while(n!=0){
            reverse=reverse*10+n%10;
            n=n/10;
        }
        return reverse;
    }
}