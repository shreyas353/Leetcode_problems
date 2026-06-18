import java.util.*;
class Solution {
    public boolean isThree(int n) {
        int root=(int)Math.sqrt(n);
        if(Math.pow(root,2)==n&&prime(root)){
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