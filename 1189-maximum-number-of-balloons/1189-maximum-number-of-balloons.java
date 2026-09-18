class Solution {
    public int maxNumberOfBalloons(String text) {
        String target="balloon";
        int count=0;
        StringBuilder sb=new StringBuilder(text);
        while(true){
            boolean canForm=true;
            for(char c:target.toCharArray()){
                int idx=sb.indexOf(String.valueOf(c));
                if(idx==-1){
                    canForm=false;
                    break;
                } 
                else{
                    sb.deleteCharAt(idx);
                }
            }
            if (canForm){
                count++;
            }
            else{
                break;
            }
        }
        return count;
    }
}
