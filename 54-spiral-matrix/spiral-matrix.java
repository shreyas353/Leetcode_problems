import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
class Solution 
{
    public List<Integer> spiralOrder(int[][] matrix) 
    {
        List<Integer> result=new ArrayList<>();
        if(matrix == null || matrix.length==0)
        {
            return result;
        }
        int m=matrix.length;
        int n=matrix[0].length;
        int top=0,bottom=m-1;
        int left=0,right=n-1;
        while(top<=bottom &&left<=right)
        {
            for(int i=left;i<=right;i++)
            {
                result.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++)
            {
                result.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom)
            {
                for(int i=right;i>=left;i--)
                {
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left<=right)
            {
                for(int i=bottom;i>=top;i--)
                {
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }
        return result;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of rows: ");
        int m=sc.nextInt();
        System.out.println("Enter the no of columns: ");
        int n=sc.nextInt();
        int[][] matrix=new int[m][n];
        System.out.println("Enter the elements in the matrix: ");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                matrix[i][j]=sc.nextInt();
            }
        }
        Solution solution=new Solution();
        List<Integer> result=solution.spiralOrder(matrix);
        System.out.println("Spiral Order: ");
        for(int num : result)
        {
            System.out.print(num + "\t");
        }
    }
}