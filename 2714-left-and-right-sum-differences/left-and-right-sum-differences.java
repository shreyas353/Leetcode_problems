class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] prefix = new int[nums.length+1];
        int[] suffix = new int[nums.length];
        int[] ans=new int[nums.length];
        for(int i=1;i<=nums.length;i++){
            prefix[i]=prefix[i-1]+nums[i-1];
        }
        suffix[nums.length-1]=0;
        for(int i=nums.length-2;i>=0;i--){
            suffix[i]=suffix[i+1]+nums[i+1];
        }
        for(int i=0;i<nums.length;i++){
            ans[i]=Math.abs(prefix[i]-suffix[i]);
        }
        return ans;
    }
}