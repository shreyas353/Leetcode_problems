class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> a[0]-b[0]);
        int result=0;
        int end1=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            int start2=intervals[i][0];
            int end2=intervals[i][1];
            if(end1>start2){
                result++;
                if(end2<end1){
                    end1=end2;
                }
            }
            else{
                end1=end2;
            }
        }
        return result;
    }
}