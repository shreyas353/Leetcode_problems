class Solution {
    public int findPeakElement(int[] nums) {
        int low=0;
        int high=nums.length-1;
        int res=-1;
        while(low<high){
            int mid=(low+high)/2;
            if(nums[mid]<=nums[mid+1]){
                low=mid+1;
            }
            else{
                res=mid;
                high=mid;
            }
        }
        if(res==-1){
            res=low;
        }
        return res; 
    }
}