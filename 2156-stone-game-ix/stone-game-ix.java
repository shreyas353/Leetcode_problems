class Solution {
    public boolean stoneGameIX(int[] stones) {
        int ans[]=new int[3];
        for(int i=0;i<stones.length;i++){
            ans[stones[i]%3]++;
        }
        if(ans[0]%2==0){
            return ans[1]>0 && ans[2]>0;
        }
        return Math.abs(ans[1]-ans[2])>2;   
    }
}