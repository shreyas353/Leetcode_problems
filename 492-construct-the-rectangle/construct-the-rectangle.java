class Solution {
    public int[] constructRectangle(int area) {
        int width=(int) Math.sqrt(area);
        int length=0;
        for (int i=width;i>=1;i--){
            if(area%i==0){
                width=i;
                length=area/i;
                break;
            }
        }
        return new int[]{length, width};
    }
}