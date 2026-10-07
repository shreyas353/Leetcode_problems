class Solution {
    Set<String> ans=new HashSet<>();
    public List<String> removeInvalidParentheses(String s) {
        int left=0;
        int right=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                left++;
            }
            else if(s.charAt(i)==')'){
                if(left>0){
                    left--;
                }
                else{
                    right++;
                }
            }
        }
        solve(s,0,left,right,0,"");
        return new ArrayList<>(ans);
    }
    void solve(String s,int index,int left,int right,int balance,String cur){
        if(index==s.length()){
            if(left==0 && right==0 && balance==0){
                ans.add(cur);
            }
            return;
        }                                                                              char ch=s.charAt(index);
        if(ch=='(' && left>0){
            solve(s,index+1,left-1,right,balance,cur);
        }
        if(ch==')' && right>0){
            solve(s,index+1,left,right-1,balance,cur);
        }
        if(ch=='('){
            solve(s,index+1,left,right,balance+1,cur+ch);
        }
        else if(ch==')'){
            if(balance>0){
                solve(s,index+1,left,right,balance-1,cur+ch);
            }
        }
        else{
            solve(s,index+1,left,right,balance,cur+ch);
        }
    }
}