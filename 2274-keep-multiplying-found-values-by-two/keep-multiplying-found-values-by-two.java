class Solution {
    public int findFinalValue(int[] nums, int original) {
        while(true){
            int result=search(nums,original);
            if(result!=-1){
                original=original*2;
            }
            else{
                break;
            }
        }
        return original;
    }
    public int search(int[] nums, int target) {
        for(int i=0;i<nums.length;i++) {
            if(nums[i]==target) {
                return i;
            }
        }
        return -1;
    }
}