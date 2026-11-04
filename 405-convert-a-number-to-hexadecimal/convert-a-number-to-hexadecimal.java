class Solution {
    public String toHex(int num) {
        if(num==0){
            return "0";
        }
        String hex="";
        long n=num;
        if(n<0){
            n=n+4294967296L;
        }
        while(n!=0){
            int rem=(int)(n%16);
            if(rem<10){
                hex=(char)(rem+'0')+hex;
            }
            else{
                hex=(char)(rem-10+'a')+hex;
            }
            n=n/16;
        }
        return hex;
    }
}