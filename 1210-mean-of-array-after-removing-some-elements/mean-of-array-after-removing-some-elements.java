class Solution {
    public double trimMean(int[] arr) {
        Arrays.sort(arr);
        int sum=0;
        for(int i=arr.length/20;i<arr.length-arr.length/20;i++){
            sum=sum+arr[i];
        }
        return (double)sum/(arr.length-2*arr.length/20);
    }
}