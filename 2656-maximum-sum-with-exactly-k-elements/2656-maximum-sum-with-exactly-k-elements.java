class Solution {
    public int maximizeSum(int[] nums, int k) {
        int maxVal=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>maxVal){
                maxVal=nums[i];
            }
        }
        int sum=k*maxVal+(k*(k-1))/2;
        return sum; 
    }
}