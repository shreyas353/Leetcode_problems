class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        int[] arr=nums.clone();
        for(int i=0;i<arr.length; i++) {
            int count = 1;
            if (arr[i]==-1) {
                continue;
            }
            for(int j=i+1;j<arr.length;j++) {
                if(arr[i] == arr[j]) {
                    count++;
                    arr[j] = -1;
                }
            }
            if (isPrime(count)) {
                return true;
            }
        }
        return false;
    }
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0) {
                return false;
            }
        }
        return true;
    }
}