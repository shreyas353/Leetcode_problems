class Solution {
    public int[][] generateMatrix(int n) {
        int arr[][]=new int[n][n];
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
                        arr[sr][i]=s;
                        s=s+1;
                    }
                    sr=sr+1;
                    for (i=sr;i<er;i++)
                    {
                        arr[i][ec-1]=s;
                        s=s+1;
                    }
                    ec=ec-1;
                    if(sr<=er)
                    {
                        for (i=ec-1;i>sc-1;i--)
                        {
                            arr[er-1][i]=s;
                            s=s+1;
                        }
                        er=er-1;
                    }
                    if(sc<=ec)
                    {
                        for (i=er-1;i>sr-1;i--)
                        {
                            arr[i][sc]=s;
                            s=s+1;
                        }
                        sc=sc+1;
                    }
                }
            }
        }
        return arr;
    }
}