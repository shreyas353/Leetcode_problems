class Solution {
    public int largestAltitude(int[] gain) {
        int left=0;
        int sum=0;
        int max=0;
        for(int i=0;i<gain.length;i++){
            sum=sum+gain[i];
        }
        for(int i=0;i<gain.length;i++){
            left=left+gain[i];
            max=Math.max(max,left);
        }
        return max;
    }
}