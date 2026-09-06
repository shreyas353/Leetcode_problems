class Solution {
    public double average(int[] salary) {
        int max=salary[0];
        int min=salary[0];
        int sum=0;
        for(int i=0;i<salary.length;i++){
            if(salary[i]>max){
                max=salary[i];
            }
            if(salary[i]<min){
                min=salary[i];
            }
            sum=sum+salary[i];
        }
        sum=sum-max-min;
        double average=(double)sum/(salary.length-2);
        return average;
    }
}