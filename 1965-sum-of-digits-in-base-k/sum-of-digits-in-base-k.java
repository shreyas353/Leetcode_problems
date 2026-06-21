class Solution {
    public int sumBase(int n, int k) {
        String res="";
        while (n>0){
            int rem=n%k;
            res=rem+res;
            n=n/k;
        }
        int result = Integer.parseInt(res);
        int sum=0;
        while(result>0){
            int digits=result%10;
            sum=sum+digits;
            result=result/10;
        }
        return sum;
    }
}