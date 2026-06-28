class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for(int x : nums){
            pq.offer(x);
        }
        long sum = 0;
        while(k-->0){
            long prd = mul;
            long temp = pq.poll();
            if(mul>0){
                prd*=temp;
                mul--;
            }
            else{
                sum+=temp;
            }
            sum+=prd;
        }
        return sum;
    }
}