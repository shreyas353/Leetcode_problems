class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int rows=matrix.length;
        int cols=matrix[0].length;
        int low=matrix[0][0];
        int high=matrix[rows-1][cols-1];
        int res=-1;
        while(low<=high){
            int mid=(low+high)/2;
            int ans=searchMatrix(matrix,mid);
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
    public int searchMatrix(int[][] matrix,int target){
        int rows=matrix.length;
        int cols=matrix[0].length;
        int row=rows-1;
        int col=0;
        int count=0;
        while(row>=0 && col<cols){
            if(matrix[row][col]<=target){
                count=count+row+1;
                col++;
            }
            else{
                row--;
            }
        }
        return count;
    }
}