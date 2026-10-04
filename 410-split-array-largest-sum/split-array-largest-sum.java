class Solution {
    public int splitArray(int[] nums, int k) {
        int low=0;
        int high=0;
        int res=-1;
        for(int i=0;i<nums.length;i++){
            low=Math.max(low,nums[i]);
            high=high+nums[i];
        }
        while(low<=high){
            int mid=(low+high)/2;
            if(CanSplit(nums,k,mid)){
                res=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return res;
    }
    public boolean CanSplit(int[] nums,int k,int guess){
        int num=1;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(sum+nums[i]<=guess){
                sum=sum+nums[i];
            }
            else{
                num++;
                sum=nums[i];
                if(num>k){
                    return false;
                }
            }
        }
        return true;
    }
}