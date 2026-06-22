import java.util.*;
class Solution {
    public boolean judgeSquareSum(int c) {
        int a=0;
        int b=(int)Math.floor(Math.sqrt(c));
        while(a<=b){
            int sum=(int)(Math.pow(a,2)+Math.pow(b,2));
            if(sum==c){
                return true;
            }
            if(sum<c){
                a++;
            }
            else{
                b--;
            }
        }
        return false;
    }
}