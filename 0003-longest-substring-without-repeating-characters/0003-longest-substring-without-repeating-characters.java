class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        for(int i = 0; i < s.length(); i++) {
            HashSet<Character> temp=new HashSet<>();
            for(int j=i;j<s.length();j++){
                char ch=s.charAt(j);
                if(temp.contains(ch))
                    break;
                temp.add(ch);
                max=Math.max(max,temp.size());
            }
        }
        return max;
    }
}