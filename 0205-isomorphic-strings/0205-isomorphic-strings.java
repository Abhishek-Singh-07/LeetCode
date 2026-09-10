class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length()!=t.length()) return false;
        int[] sMap=new int[256];
        int[] tMap=new int[256];
        for(int i=0;i<s.length();i++){
            char sc=s.charAt(i);
            char tc=t.charAt(i);
            if(sMap[sc]==0 && tMap[tc]==0){
                sMap[sc]=tc;
                tMap[tc]=sc;
            } 
            else{
                if(sMap[sc]!=tc || tMap[tc]!=sc){
                    return false;
                }
            }
        }
        return true;
    }
}
