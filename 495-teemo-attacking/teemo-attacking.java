class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int res=0;
        for(int i=1;i<timeSeries.length;i++){
            res=res+Math.min(duration,timeSeries[i]-timeSeries[i-1]);
        }
        res=res+duration;
        return res;
    }
}