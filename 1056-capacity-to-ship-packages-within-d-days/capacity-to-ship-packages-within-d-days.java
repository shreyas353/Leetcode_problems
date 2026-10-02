class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=0;
        int high=0;
        int res=-1;
        for(int i=0;i<weights.length;i++){
            low=Math.max(low,weights[i]);
            high=high+weights[i];
        }
        while(low<=high){
            int mid=(low+high)/2;
            if(canShip(weights,days,mid)){
                res=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return res;
    }
    public boolean canShip(int[] weights,int days,int capacity){
        int day=1;
        int weight=0;
        for(int i=0;i<weights.length;i++){
            if(weight+weights[i]<=capacity){
                weight=weight+weights[i];
            }
            else{
                day++;
                weight=weights[i];
                if(day>days){
                    return false;
                }
            }
        }
        return true;
    }
}