class Solution {
    Integer[][] dp;
    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        int n=satisfaction.length;
        dp=new Integer[n][n + 1];
        return solve(0,1,satisfaction);
    }
    private int solve(int i,int time,int[] sat) {
        if(i==sat.length)
            return 0;
        if(dp[i][time] != null)
            return dp[i][time];
        // Pick
        int pick=sat[i]*time+solve(i+1,time+1,sat);
        // Not Pick
        int notPick=solve(i+1,time,sat);
        return dp[i][time]=Math.max(pick,notPick);
    }
}