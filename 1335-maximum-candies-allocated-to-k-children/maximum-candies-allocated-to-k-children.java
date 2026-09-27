class Solution {
    public int maximumCandies(int[] candies, long k) {
        int low=1;
        int high=0;
        for(int i=0;i<candies.length;i++){
            high=Math.max(high,candies[i]);
        }
        int res=0;
        while(low<=high){
            int mid=(low+high)/2;
            long child=children(candies,mid);
            if(child>=k){
                res=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return res;
    }
    public long children(int[] candies,int candy){
        long c=0;
        for(int i=0;i<candies.length;i++){
            c=c+candies[i]/candy;
        }
        return c;
    }
}