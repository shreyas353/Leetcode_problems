class Solution {
    public int countPrimeSetBits(int left, int right){
        int count=0;
        for(int i=left;i<=right;i++){
            String bin=Binary(i);
            if(Prime(count(bin))){
                count++;
            }
        }
        return count;
    }
    public static int count(String s){
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                count++;
            }
        }
        return count;
    }
    public static String Binary(int n){
        if(n==0){
            return "0";
        }
        String binary="";
        while(n!=0){
            binary=n%2+binary;
            n=n/2;
        }
        return binary;
    }
    public static boolean Prime(int n){
        if(n<2){
            return false;
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}