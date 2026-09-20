class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int res[]=new int[nums1.length];
        Stack<Integer>st=new Stack<>();
        for(int i=nums2.length-1;i>=0;i--){
            while(!st.empty() && st.peek()<=nums2[i]){
                st.pop();
            }
            int greater;
            if(st.empty()){
                greater=-1;
            }
            else{
                greater=st.peek();
            }
            for(int j=0;j<nums1.length;j++) {
                if(nums1[j]==nums2[i]) {
                    res[j]=greater;
                }
            }
            st.push(nums2[i]);
        }
        return res;
    }
}