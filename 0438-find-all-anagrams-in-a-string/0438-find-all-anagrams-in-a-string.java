class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans=new ArrayList<>();
        char[] p1=p.toCharArray();
        Arrays.sort(p1);
        for(int i=0;i<=s.length()-p.length();i++){
            char[] a=s.substring(i,i+p.length()).toCharArray();
            Arrays.sort(a);
            if(Arrays.equals(a,p1))
            ans.add(i);
        }
        return ans;
    }
}