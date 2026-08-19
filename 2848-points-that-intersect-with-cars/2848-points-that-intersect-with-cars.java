class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
      int[] prefixSum=new int[102];
      for(List<Integer> num:nums){
        int left=num.get(0);
        int right=num.get(1);
        prefixSum[left]+=1;
        prefixSum[right+1]-=1;
      }  
      int count=0;
      for(int i=1;i<102;i++){
        prefixSum[i]=prefixSum[i-1]+prefixSum[i];
        if(prefixSum[i]>0){
            count+=1;
        }
      }
      return count;
    }
}