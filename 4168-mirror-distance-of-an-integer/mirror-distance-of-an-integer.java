import java.util.*;
class Solution {
    public int mirrorDistance(int n) {
        int original=n;
        int reverse=0;
        while(n!=0){
            int digits=n%10;
            reverse=reverse*10+digits;
            n=n/10;
        }
        int result=Math.abs(original-reverse);
        return result;
    }
}