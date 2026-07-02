class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int[][] matrix=new int[m][n];
        for(int i=0;i<original.length;i++){
            if (original.length!=m*n){
                return new int[0][0];
            }
            matrix[i/n][i%n]=original[i];
        }
        return matrix;
    }
}