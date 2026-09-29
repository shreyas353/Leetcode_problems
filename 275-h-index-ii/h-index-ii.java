class Solution {
    public int hIndex(int[] citations) {
        int low=0;
        int high=citations.length-1;
        int res=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(citations[mid]<citations.length-mid){
                low=mid+1;
            }
            else{
                res=citations.length-mid;
                high=mid-1;
            }
        }
        return res;
    }
}