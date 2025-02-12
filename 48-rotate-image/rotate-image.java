class Solution
{
    public void rotate(int[][] matrix) 
    {
        int n = matrix.length;
        int m = matrix[0].length;
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < m; j++) 
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0, k = m - 1; j < k; j++, k--) 
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][k];
                matrix[i][k] = temp;
            }
        }
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of rows: ");
        int n = sc.nextInt();
        System.out.print("Enter the no of columns: ");
        int m = sc.nextInt();
        int matrix[][]= new int[n][m];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) 
        { 
            for (int j = 0; j < n; j++) 
            {
                matrix[i][j] = sc.nextInt();
            }
        }
        sc.close();
        System.out.println("Original Matrix:");
        for (int i = 0; i < n; i++) 
        { 
            for (int j = 0; j < m; j++) 
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        Solution solution = new Solution();
        solution.rotate(matrix);
        System.out.println("Rotated Matrix (90 degrees clockwise):");
        for (int i = 0; i < n; i++) 
        { 
            for (int j = 0; j < m; j++) 
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}