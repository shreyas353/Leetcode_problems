import java.util.*;
class Pair{
    int first;
    int second;
    Pair(int f, int s) {
        first=f;
        second=s;
    }
}
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)-> a.first-b.first);
        for (int i:map.keySet()) {
            int first=i;
            int second=map.get(i);
            Pair curr=new Pair(second, first);
            if(pq.size()<k){
                pq.add(curr);
                continue;
            }
            if(curr.first<=pq.peek().first){
                continue;
            }
            pq.poll();
            pq.add(curr);
        }
        int[] res=new int[k];
        for(int i=0;i<k;i++){
            res[i]=pq.poll().second;
        }
        return res;
    }
}