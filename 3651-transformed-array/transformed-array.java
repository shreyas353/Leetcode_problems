class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int res[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int index=Math.floorMod(i+nums[i],nums.length);
            res[i]=nums[index];
        }
        return res;
    }
}