class Solution {
    public int maximizeExpressionOfThree(int[] nums) {
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++){
                for(int k=0;k<n;k++){
                    if(i!=j && j!=k && i!=k){
                        int val=nums[i]+nums[j]-nums[k];
                        max=Math.max(max,val);
                    }
                }
            }
        }
        return max;
    }
}