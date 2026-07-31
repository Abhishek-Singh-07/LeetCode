class Solution {
    public int change(int amount, int[] coins){
        //Memoization
        Integer[][] dp=new Integer[coins.length][amount+1];
        return solve(0,amount,coins,dp);
    }
    private int solve(int index,int amount,int[] coins,Integer[][] dp){
        if(amount==0){
            return 1;
        }
        if(index==coins.length){
            return 0;
        }
        if (dp[index][amount]!=null) {
            return dp[index][amount];
        }
        int take=0;
        if(coins[index]<=amount) {
            take=solve(index,amount-coins[index],coins,dp);
        }
        int skip=solve(index+1,amount,coins,dp);
        dp[index][amount]=take+skip;
        return dp[index][amount];
    }
}