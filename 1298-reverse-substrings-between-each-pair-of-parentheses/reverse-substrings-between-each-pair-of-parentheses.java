import java.util.Stack;
class Solution {
    public String reverseParentheses(String s) {
        Stack<String> st=new Stack<>();
        String str="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                st.push(str);
                str="";
            }
            else if(ch==')'){
                StringBuilder sb=new StringBuilder(str);
                str=sb.reverse().toString();
                str=st.pop()+str;
            }
            else{
                str=str+ch;   
            }
        }
        return str;
    }
}