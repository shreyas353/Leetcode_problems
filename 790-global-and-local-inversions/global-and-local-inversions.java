class Solution {
    public boolean isIdealPermutation(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(Math.abs(nums[i]-i)>1){
                return false;
            }
        }
        return true;
        // if(global_inversion(nums)==local_inversions(nums)){
        //     return true;
        // }
        // return false;
    }
    // public int global_inversion(int[] nums){
    //     int count=0;
    //     for(int i=0;i<nums.length;i++){
    //         for(int j=i+1;j<nums.length;j++){
    //             if(nums[i]>nums[j]){
    //                 count++;
    //             }
    //         }
    //     }
    //     return count;
    // }
    // public int local_inversions(int[] nums){
    //     int count=0;
    //     for(int i=0;i<nums.length-1;i++){
    //         if(nums[i]>nums[i+1]){
    //             count++;
    //         }
    //     }
    //     return count;
    // }
}