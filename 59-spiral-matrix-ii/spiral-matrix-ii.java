class Solution 
{
    public int[][] generateMatrix(int n) 
    {
        int a[][]=new int[n][n];
        int sr=0,sc=0,er=n,ec=n;
        int s=1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                while(sr<=er&&sc<=ec)
                {
                    for (i=sc;i<ec;i++)
                    {
                        a[sr][i]=s;
                        s=s+1;
                    }
                    sr=sr+1;
                    for (i=sr;i<er;i++)
                    {
                        a[i][ec-1]=s;
                        s=s+1;
                    }
                    ec=ec-1;
                    if(sr<=er)
                    {
                        for (i=ec-1;i>sc-1;i--)
                        {
                            a[er-1][i]=s;
                            s=s+1;
                        }
                        er=er-1;
                    }
                    if(sc<=ec)
                    {
                        for (i=er-1;i>sr-1;i--)
                        {
                            a[i][sc]=s;
                            s=s+1;
                        }
                        sc=sc+1;
                    }
                }
            }
        }
        return a;
    }
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size of matrix:");
        int n=scan.nextInt();
        Solution solution=new Solution();
        int matrix[][]=solution.generateMatrix(n);
        System.out.println("Spiral matrix:");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
    }
}