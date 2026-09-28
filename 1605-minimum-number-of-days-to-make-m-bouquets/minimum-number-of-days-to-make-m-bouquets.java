class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int low=1;
        int high=0;
        for(int i=0;i<bloomDay.length;i++){
            high=Math.max(high,bloomDay[i]);
        }
        int res=-1;
        while(low<=high){
            int mid=(low+high)/2;
            int bonquets=flowers(bloomDay,mid,k);
            if(bonquets<m){
                low=mid+1;
            }
            else{
                res=mid;
                high=mid-1;
            }
        }
        return res;
    }
    public int flowers(int[] bloomDay, int day, int k){
        int count=0;
        int bonquet=0;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<=day){
                count++;
                if(count==k){
                    bonquet++;
                    count=0;
                }
            }
            else{
                count=0;
            }
        }
        return bonquet;
    }
}