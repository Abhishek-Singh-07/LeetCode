class Solution {
    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        int n=satisfaction.length;
        int[][] dp=new int[n+1][n+2];
        for(int i=n-1;i>=0;i--) {
            for(int time=n;time>=1;time--) {
                int pick=satisfaction[i]*time+dp[i+1][time+1];
                int notPick=dp[i+1][time];
                dp[i][time]=Math.max(pick,notPick);
            }
        }
        return dp[0][1];
    }
}