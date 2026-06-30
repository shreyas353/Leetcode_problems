class Solution {
    public int primePalindrome(int n) {
        if(n>=8&&n<=11) {
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
        if(n==2){
            return true;
        }
        if(n%2==0){
            return false;
        }
        int i=3;
        while(i*i<=n) {
            if(n%i==0) {
                return false;
            }
            i=i+2;
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