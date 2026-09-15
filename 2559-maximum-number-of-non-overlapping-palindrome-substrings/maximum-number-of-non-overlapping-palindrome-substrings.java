class Solution {
    public int maxPalindromes(String s, int k) {
        boolean[][] pal=new boolean[s.length()][s.length()];
        for(int i=s.length()-1;i>=0;i--){
            for(int j=i;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j) &&
                    (j-i<2 || pal[i+1][j-1])){
                    pal[i][j]=true;
                }
            }
        }
        int[] dp=new int[s.length()+1];
        for(int i=s.length()-1;i>=0;i--){
            dp[i]=dp[i+1];
            for(int j=i+k-1;j<s.length();j++){
                if(pal[i][j]){
                    dp[i]=Math.max(dp[i],1+dp[j+1]);
                }
            }
        }
        return dp[0];
    }
}