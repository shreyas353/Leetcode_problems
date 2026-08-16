import java.util.HashMap;
class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int sum=0;
        int res=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==1){
                sum++;
            }
            int ques=sum-k;
            res=res+map.getOrDefault(ques,0);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return res;
    }
}