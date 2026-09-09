class Solution {
    public long countCommas(long n) {
        long count=0;
        long x=1000;
        while(x<=n){
            count=count+(n-x+1);
            x=x*1000;
        }
        return count;
    }
}