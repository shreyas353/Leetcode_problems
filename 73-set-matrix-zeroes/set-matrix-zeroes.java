class Solution 
{ 
    public void setZeroes(int[][] matrix) 
    {
        Set<Integer> rowsSet=new HashSet<>();
        Set<Integer> colsSet=new HashSet<>();
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==0)
                {
                    rowsSet.add(i);
                    colsSet.add(j);
                }
            }
        }
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(rowsSet.contains(i)||colsSet.contains(j))
                {
                    matrix[i][j]=0;
                }
            }
        }
    }
}
// class Solution 
// {
//     public void setZeroes(int[][] matrix) 
//     {
//         boolean rows[] = new boolean[matrix.length];
//         boolean cols[] = new boolean[matrix[0].length];
//         for(int i=0;i<matrix.length;i++)
//         {
//             for(int j=0;j<matrix[0].length;j++)
//             {
//                 if(matrix[i][j]==0)
//                 {
//                     rows[i] = true;
//                     cols[j] = true;
//                 }
//             }
//         }
//         for(int i=0;i<matrix.length;i++)
//         {
//             for(int j=0;j<matrix[0].length;j++)
//             {
//                 if(rows[i]||cols[j])
//                 {
//                     matrix[i][j]=0;
//                 }
//             }
//         }
//     }
// }
