class Solution {
    public int countPrimeSetBits(int left, int right){
        int count=0;
        for(int i=left;i<=right;i++){
            if(Prime(CountBinary(i))){
                count++;
            }
        }
        return count;
    }
    public static int CountBinary(int n){
        if(n==0){
            return 0;
        }
        String binary="";
        while(n!=0){
            binary=n%2+binary;
            n=n/2;
        }
        int count=0;
        for(int i=0;i<binary.length();i++){
            if(binary.charAt(i)=='1'){
                count++;
            }
        }
        return count;
    }
    public static boolean Prime(int n){
        if(n<2){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}