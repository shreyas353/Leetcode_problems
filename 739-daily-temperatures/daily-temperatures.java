class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int res[]=new int[temperatures.length];
        Stack<Integer> st=new Stack<>();
        st.push(temperatures.length-1);
        res[temperatures.length-1]=0;
        for(int i=temperatures.length-1;i>=0;i--){
            while(!st.empty() && temperatures[st.peek()]<=temperatures[i]){
                st.pop();
            }
            if(st.empty()){
                res[i]=0;
            }
            else{
                res[i]=st.peek()-i;
            }
            st.push(i);
        }
        return res;
    }
}