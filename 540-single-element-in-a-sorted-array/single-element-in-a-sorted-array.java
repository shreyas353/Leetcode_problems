class Solution 
{
    public int singleNonDuplicate(int[] nums) 
    {
        int left=0;
        int right=nums.length-1;
        while(left<right)
        {
            int mid=left+(right-left)/2;
            if(nums[mid]==nums[mid+1])
            {
                mid=mid-1;
            }
            int leftpartlength=(mid-left)+1;
            if(leftpartlength%2==1)
            {
                right=mid;
            }
            else
            {
                left=mid+1;
            }
        }
        return nums[left];
    }
}