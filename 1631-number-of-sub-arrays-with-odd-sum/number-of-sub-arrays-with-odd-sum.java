class Solution {
    public int numOfSubarrays(int[] arr) {
        int even=1;
        int odd=0;
        int count=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
            if(sum%2!=0){
                count=count+even;
                odd++;
            }
            else{
                count=count+odd;
                even++;
            }
            count=count%1000000007;
        }
        return (int)count;
    }
}