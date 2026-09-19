import java.util.Stack;
class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<int[]> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(st.empty()){
                st.push(new int[]{ch,1});
                continue;
            }
            if(st.peek()[0]!=ch){
                st.push(new int[]{ch,1});
                continue;
            }
            if(st.peek()[1]==k-1){
                st.pop();
                continue;
            }
            st.peek()[1]++;
        }
        StringBuilder res=new StringBuilder();
        while(!st.empty()){
            int[] p=st.pop();
            while(p[1]-->0){
                res.append((char)p[0]);
            }
        }
        return res.reverse().toString();
    }
}