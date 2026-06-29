import java.util.*;

class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        List<int[]>[] graph = new ArrayList[n + 1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int[] edge : times) {
            graph[edge[0]].add(new int[]{edge[1], edge[2]});
        }
        int[] dist = new int[n + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        dist[k] = 0;
        pq.offer(new int[]{k, 0});
        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int node = curr[0];
            int time = curr[1];
            if (time > dist[node]) {
                continue;
            }
            for (int[] neighbor : graph[node]) {
                int next = neighbor[0];
                int weight = neighbor[1];
                if (dist[next] > dist[node] + weight) {
                    dist[next] = dist[node] + weight;
                    pq.offer(new int[]{next, dist[next]});
                }
            }
        }
        int maxTime = 0;
        for (int i = 1; i <= n; i++) {
            if (dist[i] == Integer.MAX_VALUE) {
                return -1;
            }
            maxTime = Math.max(maxTime, dist[i]);
        }
        return maxTime;
    }
}