class Solution
{
    public int[][] transpose(int[][] matrix) 
    {
        int n=matrix.length;
        int m=matrix[0].length;
        int res[][]=new int[m][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                res[j][i]=matrix[i][j];
            }
        }
        return res;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of rows: ");
        int n=sc.nextInt();
        System.out.println("Enter the no of columns: ");
        int m=sc.nextInt();
        int matrix[][]=new int[n][m];
        System.out.println("Enter the elements in the matrix: ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                matrix[i][j]=sc.nextInt();
            }
        }
        sc.close();
        System.out.println("Transpose matrix: ");
        Solution solution=new Solution();
        solution.transpose(matrix);
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
    }
}