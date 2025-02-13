class Solution
{
    public boolean isHappy(int n) 
    {
        int temp=n;
        while(temp!=1 && temp!=4)
        {
            int sum=0;
            while(temp>0)
            {
                int digit=temp%10;
                sum=sum+digit*digit;
                temp=temp/10;
            }
            temp=sum;
        }
        return (temp==1);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        Solution solution = new Solution();
        boolean res=solution.isHappy(n);
        System.out.println(res);
    }
}