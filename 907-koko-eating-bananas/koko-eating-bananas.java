class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=0;
        for(int i=0;i<piles.length;i++){
            high=Math.max(high,piles[i]);
        }
        int res=-1;
        while(low<=high){
            int mid=(low+high)/2;
            long hours=speed(piles,mid);
            if(hours>h){
                low=mid+1;
            }
            else{
                res=mid;
                high=mid-1;
            }
        }
        return res;
    }
    public long speed(int[] piles,int speed){
        long h=0;
        for(int i=0;i<piles.length;i++){
            h=h+piles[i]/speed;
            if(piles[i]%speed!=0){
                h++;
            }
        }
        return h;
    }
}