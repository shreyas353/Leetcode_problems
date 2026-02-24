import java.util.*;
class Solution {
    public int[] sortedSquares(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int pos=nums.length-1;
        int result[]=new int[nums.length];
        while(left<=right){
            if(Math.pow(nums[left],2)>Math.pow(nums[right],2)){
                result[pos]=(int)Math.pow(nums[left],2);
                left++;
            }
            else{
                result[pos]=(int)Math.pow(nums[right],2);
                right--;
            }
            pos--;
        }
        return result;
    }
}