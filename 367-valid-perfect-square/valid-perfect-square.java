class Solution 
{
    public boolean isPerfectSquare(int num) 
    {
        if (num < 1) return false;

        long low = 1, high = num;
        while (low <= high) 
        {
            long mid = low + (high - low) / 2;
            long square = mid * mid;
            if (square == num)
            {
                return true;
            } 
            else if (square < num)
            {
                low = mid + 1;
            }
            else 
            {
                high = mid - 1;
            }
        }
        return false;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        Solution solution=new Solution();
        boolean res=solution.isPerfectSquare(n);
        System.out.println(res);
    }
}