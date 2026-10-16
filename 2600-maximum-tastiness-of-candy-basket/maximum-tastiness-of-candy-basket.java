class Solution {
    public int maximumTastiness(int[] price, int k) {
        Arrays.sort(price);
        int low=0;
        int high=price[price.length-1]-price[0];
        int res=-1;
        while(low<=high){
            int mid=(low+high)/2;
            int ans=count(price,mid,k);
            if(ans>=k){
                res=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return res;
    }
    public int count(int[] price, int guess, int k){
        int count=1;
        int prev=price[0];
        for(int i=1;i<price.length;i++){
            if(price[i]-prev>=guess){
                count++;
                prev=price[i];
            }
        }
        return count;
    }
}