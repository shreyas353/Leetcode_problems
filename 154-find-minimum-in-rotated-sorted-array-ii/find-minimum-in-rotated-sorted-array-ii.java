class Solution {
    public int findMin(int[] nums) {
        int low=0;
        int high=nums.length-1;
        int res=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]>nums[high]){
                low=mid+1;
            }
            else if(nums[mid]<nums[high]){
                res=mid;
                high=mid;
            }
            else{
                high--;
            }
        }
        res=low;
        return nums[res];
    }
}