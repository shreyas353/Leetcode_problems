class Solution {
    public int search(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>nums[nums.length-1]){
                if(nums[mid]<target){
                    low=mid+1;
                }
                else{
                    if(nums[0]>target){
                        low=mid+1;
                    }
                    else{
                        high=mid-1;
                    }
                }
            }
            else{
                if(nums[mid]>target){
                    high=mid-1;
                }
                else{
                    if(nums[nums.length-1]<target){
                        high=mid-1;
                    }
                    else{
                        low=mid+1;
                    }
                }
            }
        }
        return -1;
    }
}