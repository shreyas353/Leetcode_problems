import java.util.*;
class Solution {
    public int minimumOperations(int[] nums) {
        HashSet<Integer> res=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                res.add(nums[i]);
            }
        }
        return res.size();
    }
}