class Solution {
    public String removeDigit(String number, char digit) {
        String ans="";
        int n=number.length();
        for(int i=0;i<n;i++){
            if(number.charAt(i)==digit){
                String candidate=number.substring(0,i)+number.substring(i+1);
                if(ans.equals("")||candidate.compareTo(ans)>0){
                    ans=candidate;
                }
            }
        }
        return ans;
    }
}