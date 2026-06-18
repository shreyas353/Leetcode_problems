class Solution {
    public int subtractProductAndSum(int n) {
        int original =n;
        int product=1;
        int sum=0;
        while(n!=0){
            int digits=n%10;
            product=product*digits;
            sum=sum+digits;
            n=n/10;
        }
        int subtract=product-sum;
        return subtract;
    }
}