class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> res=new ArrayList<>();
        int start=newInterval[0];
        boolean insert=false;
        for(int i=0;i<intervals.length;i++){
            if(insert==false && start<intervals[i][0]){
                res.add(newInterval);
                insert=true;
            }
            res.add(intervals[i]);
        }
        if(insert==false){
            res.add(newInterval);
        }
        return merge(res.toArray(new int[res.size()][]));
    }
    public int[][] merge(int[][] intervals){
        List<int[]> res=new ArrayList<>();
        int start1=intervals[0][0];
        int end1=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            int start2=intervals[i][0];
            int end2=intervals[i][1];
            if(end1>=start2){
                start1=start1;
                end1=Math.max(end1,end2);
                continue;
            }
            res.add(new int[]{start1,end1});
            start1=start2;
            end1=end2;
        }
        res.add(new int[]{start1,end1});
        return res.toArray(new int[res.size()][]);
    }
}