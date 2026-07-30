class Solution {
    public int maximumSum(int[] arr) {
        int no_delete=arr[0];
        int one_delete=0;
        int res=arr[0];
        for(int i=1;i<arr.length;i++){
            int prev_no_delete=no_delete;
            int prev_one_delete=one_delete;
            no_delete=Math.max(no_delete+arr[i],arr[i]);
            one_delete=Math.max(prev_one_delete+arr[i],prev_no_delete);
            res=Math.max(res,Math.max(one_delete,no_delete));
        }
        return res;
    }
}