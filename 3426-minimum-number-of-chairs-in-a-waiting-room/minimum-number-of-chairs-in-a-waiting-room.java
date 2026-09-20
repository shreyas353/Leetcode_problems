class Solution {
    public int minimumChairs(String s) {
        int chairs=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='E'){
                chairs++;
                max=Math.max(max,chairs);
            }
            else{
                chairs--;
            }
        }
        return max;
    }
}