class Solution {
    static int mod = 1_000_000_007;
    public int maximumProduct(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i : nums){
            pq.offer(i);
        }
        while(k-->0){
            int num = pq.poll();
            num++;
            pq.offer(num);
        }
        long prd = 1;
        while(!pq.isEmpty()){
            prd*=pq.poll();
            prd%=mod;
        }
        return (int)prd;
    }
}