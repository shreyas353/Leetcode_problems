import java.util.Scanner;
class Solution 
{
    public int divide(int dividend, int divisor) 
    {
        if (divisor == 0) 
        {
            return 0;
        }
        if (dividend == Integer.MIN_VALUE && divisor == -1) 
        {
            return Integer.MAX_VALUE;
        }
        boolean isNegative = (dividend < 0) ^ (divisor < 0); 
        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);
        int quotient = 0;
        while (a >= b) 
        {
            long temp = b, multiple = 1;
            while (a >= (temp << 1)) 
            {
                temp <<= 1;   
                multiple <<= 1;
            }
            a = a - temp;
            quotient += multiple;
        }
        return isNegative ? -quotient : quotient;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter dividend: ");
        int dividend = sc.nextInt();
        System.out.print("Enter divisor: ");
        int divisor = sc.nextInt();
        Solution solution = new Solution();
        int result = solution.divide(dividend, divisor);
        System.out.println("Quotient: " + result);
    }
}