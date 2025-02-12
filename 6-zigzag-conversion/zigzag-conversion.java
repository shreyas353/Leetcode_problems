class Solution 
{
    public String convert(String s, int numRows) 
    {
        if (numRows == 1 || s.length() <= numRows) 
        {
            return s; 
        }
        String a[] = new String[numRows]; 
        for (int i = 0; i < numRows; i++) 
        {
            a[i] = ""; 
        }
        int row = 0;
        boolean down = false;
        for (int i = 0; i < s.length(); i++) 
        {
            a[row] = a[row] + s.charAt(i); 
            if (row == 0) 
            {
                down = true;
            }
            if (row == numRows - 1) 
            {
                down = false;
            }
            if (down) 
            {
                row++;
            } 
            else 
            {
                row--;
            }
        }
        String result = "";
        for (int i = 0; i < numRows; i++) 
        {
            result = result + a[i];
        }
        return result;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        System.out.print("Enter the rows: ");
        int numRows = sc.nextInt();
        sc.close();
        Solution solution = new Solution();
        String result = solution.convert(s, numRows);
        System.out.println("Zigzag Conversion Output: " + result);
    }
}