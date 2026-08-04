class Solution {
    public int pivotInteger(int n) {
        int left=0;
        int total=n*(n+1)/2;
        if(0==total-1){
            return 1;
        }
        for(int i=2;i<=n;i++){
            left=left+i-1;
            int right=total-left-i;
            if(left==right){
                return i;
            }
        }
        return -1;
    }
}