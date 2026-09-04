class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int left_max=nums[0];
        for(int i=0;i<nums.length;i++){
            left_max=Math.max(left_max,nums[i]);
            int right_min=nums[i];
            for(int j=i;j<nums.length;j++){
                right_min=Math.min(right_min,nums[j]);
            }
            int score=left_max-right_min;
            if(score<=k){
                return i;
            }
        }
        return -1;
    }
}