class Solution {
    public long repairCars(int[] ranks, int cars) {
        long low=1;
        long high=1L*ranks[0]*cars*cars;
        for(int i=0;i<ranks.length;i++){
            high=Math.min(high,1L*ranks[i]*cars*cars);
        }
        long res=-1;
        while(low<=high){
            long mid=(low+high)/2;
            long hours=cars(ranks,mid);
            if(hours>=cars){
                res=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return res;
    }
    public long cars(int[] ranks, long time){
        long count=0;
        for(int i=0;i<ranks.length;i++){
            count=count+(long)Math.sqrt(time/ranks[i]);
        }
        return count;
    }
}