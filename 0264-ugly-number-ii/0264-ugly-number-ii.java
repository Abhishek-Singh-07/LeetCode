class Solution {
    public int nthUglyNumber(int n) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        HashSet<Long> set = new HashSet<>();
        pq.add(1L);
        set.add(1L);
        long ugly = 1;
        for (int i = 0; i < n; i++) {
            ugly = pq.poll();
            long num2 = ugly * 2;
            long num3 = ugly * 3;
            long num5 = ugly * 5;
            if (set.add(num2)) {
                pq.add(num2);
            }
            if (set.add(num3)) {
                pq.add(num3);
            }
            if (set.add(num5)) {
                pq.add(num5);
            }
        }
        return (int) ugly;
    }
}