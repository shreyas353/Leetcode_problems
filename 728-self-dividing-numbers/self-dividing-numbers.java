class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
         List<Integer> ans=new ArrayList<>();
        for(int i=left;i<=right;i++){
            int original=i;
            boolean self=true;
            while(original>0){
                int digits=original%10;
                if(digits==0||i%digits!=0){
                    self=false;
                    break;
                }
                original=original/10;
            }
            if(self){
                ans.add(i);
            }
        }
        return ans;
    }
}