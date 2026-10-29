class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq=new PriorityQueue<>(
            (a, b) -> {
                int d1=a[0]*a[0]+a[1]*a[1];
                int d2=b[0]*b[0]+b[1]*b[1];
                return Integer.compare(d2, d1);
            }
        );
        for(int i=0;i<points.length;i++){
            pq.add(points[i]);
            if (pq.size()>k){
                pq.poll();
            }
        }
        int[][] res=new int[k][2];
        int i=0;
        while (!pq.isEmpty()){
            res[i]=pq.poll();
            i++;
        }
        return res;
    }
} 