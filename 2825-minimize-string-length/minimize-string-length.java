import java.util.Stack;
class Solution {
    public int minimizedStringLength(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(!st.contains(s.charAt(i))){
                st.push(s.charAt(i));
            }
        }
        return st.size();
    }
}