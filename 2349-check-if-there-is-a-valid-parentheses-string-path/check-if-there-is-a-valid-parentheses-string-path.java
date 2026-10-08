class Solution {
    public boolean hasValidPath(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        if((m+n-1)%2==1){
            return false;
        }
        if(grid[0][0]==')' || grid[m-1][n-1]=='('){
            return false;
        }
        boolean[][][] dp=new boolean[m][n][m+n];
        dp[0][0][1]=true;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                for(int bal=0;bal<m+n;bal++){
                    if(!dp[i][j][bal]){
                        continue;
                    }
                    if(i+1<m){
                        int nextBal=bal;
                        if(grid[i+1][j]=='('){
                            nextBal++;
                        }
                        else{
                            nextBal--;
                        }
                        if(nextBal>=0){
                            dp[i+1][j][nextBal]=true;
                        }
                    }
                    if(j+1<n){
                        int nextBal=bal;
                        if(grid[i][j+1]=='('){
                            nextBal++;
                        }
                        else{
                            nextBal--;
                        }
                        if(nextBal>=0){
                            dp[i][j+1][nextBal]=true;
                        }
                    }
                }
            }
        }
        return dp[m-1][n-1][0];
    }
}