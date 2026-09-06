class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        Set<String> prefixes=new HashSet<>();
        for(int a:arr1){
            String s=String.valueOf(a);
            for(int i=1;i<=s.length();i++){
                prefixes.add(s.substring(0,i));
            }
        }
        int maxPrefix=0;
        for(int b:arr2){
            String s=String.valueOf(b);
            for(int i=1;i<=s.length();i++) {
                if(prefixes.contains(s.substring(0,i))){
                    maxPrefix=Math.max(maxPrefix,i);
                }
            }
        }
        return maxPrefix;
    }
}
