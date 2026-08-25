class Solution {
    public int missingMultiple(int[] nums, int k) {
        for(int x=k; ;x=x+k){
            int i;
            for(i=0;i<nums.length;i++){
                if(nums[i]==x){
                    break;
                }
            }
            if(i==nums.length){
                return x;
            }
        }
    }
}