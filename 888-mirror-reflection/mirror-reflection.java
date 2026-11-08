class Solution {
    public int mirrorReflection(int p, int q) {
        int gcd=findgcd(p,q);
        p=p/gcd;
        q=q/gcd;
        if(p%2==0){
            return 2;
        }
        if(q%2==0){
            return 0;
        }
        return 1;
    }
    public int findgcd(int a,int b){
        if(b==0){
            return a;
        }
        return findgcd(b,a%b);
    }
}