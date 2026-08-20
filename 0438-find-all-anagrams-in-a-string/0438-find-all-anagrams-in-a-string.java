class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans=new ArrayList<>();
        int[] a=new int[26];
        int[] b=new int[26];
        int k=p.length();
        for(char c:p.toCharArray())
        a[c-'a']++;
        for(int i=0;i<s.length();i++){
            b[s.charAt(i)-'a']++;
            if(i>=k)
            b[s.charAt(i-k)-'a']--;
            if(Arrays.equals(a,b))
            ans.add(i-k+1);
        }
        return ans;
    }
}