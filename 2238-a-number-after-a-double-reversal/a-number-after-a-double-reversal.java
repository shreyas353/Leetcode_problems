class Solution {
    public boolean isSameAfterReversals(int num) {
        if(num==(reverse(reverse(num)))){
            return true;
        }
        return false;
    }
    public static int reverse(int n){
        int original=n;
        int reverse=0;
        while(n!=0){
            int digits=n%10;
            reverse=reverse*10+digits;
            n=n/10;
        }
        return reverse;
    }
}