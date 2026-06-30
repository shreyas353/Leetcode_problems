class Solution {
    public int primePalindrome(int n) {
        if (n >= 8 && n <= 11) {
            return 11;
        }
        int i=1;
        while(true){

            if(Palindrome(i)>=n && Prime(Palindrome(i))){
                return Palindrome(i);
            }
            i++;
        }
    }
    public static boolean Prime(int n) {
        if(n<2){
            return false;
        }
        for(int i=2;i*i<=n;i++) {
            if(n%i==0) {
                return false;
            }
        }
        return true;
    }
    public static int Palindrome(int n){
        int x=n/10;
        while(x!=0){
            int digits=x%10;
            n=n*10+digits;
            x=x/10;
        }
        return n;
    }
}