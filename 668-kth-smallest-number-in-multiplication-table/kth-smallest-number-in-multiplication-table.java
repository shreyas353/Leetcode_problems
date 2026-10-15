class Solution {
    public int findKthNumber(int m, int n, int k) {
        int low=1;
        int high=m*n;
        int res=-1;
        while(low<=high){
            int mid=(low+high)/2;
            int ans=searchMatrix(m,n,mid);
            if(ans<k){
                low=mid+1;
            }
            else{
                res=mid;
                high=mid-1;
            }
        }
        return res;
    }
    public int searchMatrix(int m,int n,int target){
        int count=0;
        for(int i=1;i<=m;i++){
            count=count+Math.min(n,target/i);
        }
        return count;
    }
}