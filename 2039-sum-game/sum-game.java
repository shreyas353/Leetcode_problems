class Solution {
    public boolean sumGame(String num) {
        char ch[]=num.toCharArray();
        int left=0;
        int right=0;
        int leftSpace=0;
        int rightSpace=0;
        for(int i=0;i<ch.length/2;i++){
            if (ch[i]=='?'){
                leftSpace++;
            }
            else{
                left=left+ch[i]-'0';
            }
            if(ch[ch.length-i-1]=='?'){
                rightSpace++;
            }
            else{
                right=right+ch[ch.length-i-1]-'0';
            }
        }
        while(leftSpace>0 && rightSpace>0){
            leftSpace--;
            rightSpace--;
        }
        if((leftSpace+rightSpace)%2!=0){
            return true;
        }
        if(leftSpace>0){
            return left+((leftSpace/2)*9)!=right;
        }
        if(rightSpace>0){
            return right+((rightSpace/2)*9)!=left;
        }
        return left!=right;
    }
}