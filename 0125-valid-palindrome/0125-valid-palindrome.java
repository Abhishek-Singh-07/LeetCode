class Solution {
    public boolean isPalindrome(String s) {   
       return s.replaceAll("[^A-Za-z0-9]", "").equalsIgnoreCase(
       new StringBuilder(s.replaceAll("[^A-Za-z0-9]", "")).reverse().toString());
    }
}