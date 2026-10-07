class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low=1;
        int high=0;
        for(int i=0;i<nums.length;i++){
            high=Math.max(high,nums[i]);
        }
        int res=-1;
        while(low<=high){
            int mid=(low+high)/2;
            long div=divisor(nums,mid);
            if(div>threshold){
                low=mid+1;
            }
            else{
                res=mid;
                high=mid-1;
            }
        }
        return res;
    }
    public long divisor(int[] nums,int div){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+(nums[i]+div-1)/div;
        }
        return sum;
    }
}