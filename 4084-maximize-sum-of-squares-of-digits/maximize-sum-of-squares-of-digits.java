class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if(sum>9*num) {
            return "";
        }
        StringBuilder res = new StringBuilder();
        for(int i=0;i<num;i++){
            if(sum>=9){
                res.append('9');
                sum=sum-9;
            }
            else{
                res.append(sum);
                sum=0;
            }
        }
        return res.toString();
    }
}