class Solution {
    public String digitSum(String s, int k) {
        while(s.length()>k){
            StringBuilder sb=new StringBuilder();
            for(int i=0;i<s.length();i=i+k){
                int sum=0;
                for(int j=i;j<s.length();j++){
                    if(j<i+k){
                        int digit=s.charAt(j)-'0';
                        sum=sum+digit;
                    }
                    else{
                        break;
                    }
                }
                sb.append(sum);
            }
            s=sb.toString();
        }
        return s;
    }
}