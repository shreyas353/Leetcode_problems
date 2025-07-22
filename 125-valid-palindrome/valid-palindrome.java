class Solution 
{
    public static boolean checkPalindrome(String s)
    {
        int left=0;
        int right=s.length()-1;
        while(left<right)
        {
            if(s.charAt(left)!=s.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public boolean isPalindrome(String s) 
    {
        String cleaned = "";
        for (int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9'))
            {
                if (ch >= 'A' && ch <= 'Z')
                {
                    ch = (char)(ch + 32);
                }
                cleaned = cleaned + ch;
            }
        }
        return checkPalindrome(cleaned);
    }
}