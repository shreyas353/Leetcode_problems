class Solution {
    public boolean checkGoodInteger(int n) {
        int digit_sum=0;
        int square_sum=0;
        while(n!=0){
            int digits=n%10;
            digit_sum=digit_sum+digits;
            square_sum=square_sum+digits*digits;
            n=n/10;
        }
        if(square_sum-digit_sum>=50){
            return true;
        }
        return false;
    }
}