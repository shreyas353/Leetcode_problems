class Solution {
    public List<String> simplifiedFractions(int n) {
        List<String> res=new ArrayList<>();
        for(int i=2;i<=n;i++){
            for(int j=1;j<i;j++){
                if(findgcd(i,j)==1){
                    res.add(j + "/" + i);
                }
            }
        }
        return res;
    }
    public int findgcd(int a,int b){
        if(b==0){
            return a;
        }
        return findgcd(b,a%b);
    }
}