class Solution 
{
    public boolean isPalindrome(int x) 
    {
        if(x<0)
        {
            return false;
        }
        int temp=x;
        int reverse=0;
        while(x!=0)
        {
            int digit=x%10;
            reverse=reverse*10+digit;
            x=x/10;
        }
        return (temp==reverse);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        Solution solution = new Solution(); 
        System.out.println(solution.isPalindrome(n));
    }
}