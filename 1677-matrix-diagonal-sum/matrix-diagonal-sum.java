class Solution
{
    public int diagonalSum(int[][] mat) 
    {
        int n=mat.length;
        int sum1=0;
        int sum2=0;
        int sum3=0;
        int result=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j)
                {
                    sum1=sum1+mat[i][j];
                }
                if((i+j)==(n-1))
                {
                    sum2=sum2+mat[i][j];
                }
            }
        }
        if (n%2==1) 
        {
            sum3 =sum3 - mat[n/2][n/2];
        }
        result=sum1+sum2+sum3;
        return result;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of matrix:");
        int n=sc.nextInt();
        int matrix[][]=new int[n][n];
        System.out.println("Enter the elements of matrix:");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Original matrix:");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
        Solution solution=new Solution();
        int res=solution.diagonalSum(matrix);
        System.out.println(res);
    }
}