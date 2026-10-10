class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int[] freq=new int[100001];
        int max=0;
        for(int i=0;i<nums1.length;i++) {
            int diff=Math.abs(nums1[i]-nums2[i]);
            freq[diff]++;
            max=Math.max(max,diff);
        }
        long k=(long)k1+k2;
        for(int i=max;i>0&&k>0;i--){
            int move=(int)Math.min(k,freq[i]);
            freq[i]-=move;
            freq[i-1]+=move;
            k -= move;
        }
        long sum = 0;
        for (int i = 1; i < freq.length; i++) {
            sum += (long) i * i * freq[i];
        }
        return sum;
    }
}