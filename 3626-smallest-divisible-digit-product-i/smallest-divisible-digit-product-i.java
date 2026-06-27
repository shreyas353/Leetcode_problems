class Solution {
    public int smallestNumber(int n, int t) {
        while(true){
            if(DigitProduct(n)%t==0){
                return n;
            }
            n++;
        }
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