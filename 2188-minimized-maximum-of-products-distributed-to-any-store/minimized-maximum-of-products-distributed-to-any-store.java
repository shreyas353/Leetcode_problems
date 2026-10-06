class Solution {
    public int minimizedMaximum(int n, int[] quantities) {
        int low=1;
        int high=0;
        for(int i=0;i<quantities.length;i++){
            high=Math.max(high,quantities[i]);
        }
        int res=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(canDistribute(n,quantities,mid)){
                res=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return res;
    }
    public boolean canDistribute(int n, int[] quantities,int guess){
        int stores=0;
        for(int i=0;i<quantities.length;i++){
            stores=stores+quantities[i]/guess;
            if(quantities[i]%guess!=0){
                stores++;
            }
            if(stores>n){
                return false;
            }
        }
        return true;
    }
}