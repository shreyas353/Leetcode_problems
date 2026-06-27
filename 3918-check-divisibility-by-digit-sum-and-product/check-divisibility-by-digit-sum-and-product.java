class Solution {
    public boolean checkDivisibility(int n) {
        int sum=DigitSum(n)+DigitProduct(n);
        if(n%sum==0){
            return true;
        }
        return false;
    }
    public static int DigitSum(int n){
        int sum=0;
        while(n!=0){
            int digits=n%10;
            sum=sum+digits;
            n=n/10;
        }
        return sum;
    }
    public static int DigitProduct(int n){
        int product=1;
        while(n!=0){
            int digits=n%10;
            product=product*digits;
            n=n/10;
        }
        return product;
    }
}