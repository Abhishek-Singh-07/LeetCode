class Solution {
    public int secondHighest(String s) {
        Set<Integer> set=new HashSet<>();
        for(char c:s.toCharArray()){
            if(Character.isDigit(c)){
                set.add(c-'0');
            }
        }
        if(set.size()<2){
            return -1;
        }
        List<Integer> list=new ArrayList<>(set);
        Collections.sort(list);
        return list.get(list.size()-2);
    }
}