class Solution
{
    public double myPow(double x, int n) 
    {
        long exp = n;
        if (exp < 0)
        {
            x = 1 / x;
            exp = -exp;
        }

        double result = 1.0;
        while (exp > 0) 
        {
            if (exp % 2 == 1) 
            {
                result = result * x; 
            }
            x =x * x;  
            exp = exp / 2;  
        }
        return result;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        double a=sc.nextDouble();
        System.out.println("Enter a power:");
        int b=sc.nextInt();
        Solution solution=new Solution();
        double res=solution.myPow(a,b);
        System.out.println(res);
    }
}