class Solution {
    public int countEven(int num) {
        int count=0;
        for(int i=1;i<=num;i++){
            if(even(sum(i))){
                count++;
            }
        }
        return count;
        
    }
    public static int sum(int n){
        int sum=0;
        while(n!=0){
            int digits=n%10;
            sum=sum+digits;
            n=n/10;
        }
        return sum;
    }
    public static boolean even(int n){
        if(n%2==0){
            return true;
        }
        return false;
    }
}