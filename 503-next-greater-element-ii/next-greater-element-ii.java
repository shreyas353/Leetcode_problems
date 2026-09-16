import java.util.Stack;
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] res=new int[nums.length];
        Stack<Integer> st=new Stack<>();
        st.push(nums[nums.length-1]);
        res[nums.length-1]=-1;
        for(int i=2*nums.length-1;i>=0;i--){
            int index=i%nums.length;
            while(!st.empty() && st.peek()<=nums[index]){
                st.pop();
            }
            if(st.empty()){
                res[index]=-1;
            }
            else{
                res[index]=st.peek();
            }
            st.push(nums[index]);
        }
        return res;
    }
}