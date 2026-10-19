import java.util.*;
class Pair{
    int first;
    String second;
    Pair(int f,String s) {
        first=f;
        second=s;
    }
}
class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<words.length;i++){
            map.put(words[i],map.getOrDefault(words[i],0)+1);
        }
        PriorityQueue<Pair> pq=new PriorityQueue<>(
            (a,b) -> {
                if(a.first!=b.first){
                    return a.first - b.first;   
                }   
                return b.second.compareTo(a.second); 
            }
        );
        for(String i:map.keySet()) {
            int first=map.get(i);
            String second=i;
            Pair curr=new Pair(first,second);
            if(pq.size()<k){
                pq.add(curr);
                continue;
            }
            if(curr.first<pq.peek().first){
                continue;
            }
            if(curr.first==pq.peek().first&&curr.second.compareTo(pq.peek().second)>0){
                continue;
            }
            pq.poll();
            pq.add(curr);
        }
        ArrayList<String> res=new ArrayList<>();
        for(int i = 0;i<k;i++) {
            res.add(pq.poll().second);
        }
        Collections.reverse(res);
        return res;
    }
}