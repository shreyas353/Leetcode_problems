import java.util.*;
class Solution {
    public boolean isThree(int n) {
        if((int)Math.sqrt(n)*(int)Math.sqrt(n)==n && prime((int)Math.sqrt(n))){
            return true;
        }
        return false;
    }
    public static boolean prime(int n){
        boolean flag = true;
        if(n<=1){
            return false;
        }
        int i=2;
        while(i<n){
            if(n%i==0){
                flag=false;
                break;
            }
            i++;
        }
        if(flag==true){
            return true;
        }
        return false;
    }
}