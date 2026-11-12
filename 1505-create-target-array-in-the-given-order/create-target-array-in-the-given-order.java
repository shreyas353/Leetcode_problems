class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> arr=new ArrayList<>();
        int[] res=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr.add(index[i],nums[i]);
        }
        for(int i=0;i<arr.size();i++){
            res[i]=arr.get(i);
        }
        return res;
    }
}