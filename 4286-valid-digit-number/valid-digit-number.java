class Solution {
    public boolean validDigit(int n, int x) {
        int original=n;
        boolean found=false;
        while(n!=0){
            if(n%10==x) {
                found=true;
                break;
            }
            n=n/10;
        }
        int first = original;
        while(first>=10) {
            first=first/10;
        }
        return (found && first!=x);
    }
}