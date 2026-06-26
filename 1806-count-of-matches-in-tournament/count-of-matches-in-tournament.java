class Solution {
    public int numberOfMatches(int n) {
        int sum=0;
        while(n>1){
            if(n%2==0){
                int matches1=n/2;
                sum=sum+matches1;
                n=matches1;
            }
            else{
                int matches2=(n-1)/2;
                sum=sum+matches2;
                n=matches2+1;
            }
        }
        return sum;
    }
}