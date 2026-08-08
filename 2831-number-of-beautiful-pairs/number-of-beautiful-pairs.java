class Solution {
    public int countBeautifulPairs(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++) {
            for(int j=i+1;j<nums.length;j++) {
                int first=nums[i];
                while(first>=10){
                    first=first/10;
                }
                int last=nums[j]%10;
                if(iscoprime(first,last)){
                    count++;
                }
            }
        }
        return count;
    }
    public boolean iscoprime(int a,int b){
        if(gcd(a,b)==1){
            return true;
        }
        return false;
    }
    public int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
}