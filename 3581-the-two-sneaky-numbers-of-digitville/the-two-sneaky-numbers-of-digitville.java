class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        ArrayList<Integer> res=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                res.add(nums[i]);
            }
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}