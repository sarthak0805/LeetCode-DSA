class Solution {
    public int[] sortArray(int[] nums) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i : nums){
            pq.offer(i);
        }
        int arr[] = new int[nums.length];
        int idx=0;
        while(!pq.isEmpty()){
            arr[idx++] = pq.poll();
        }
        return arr;
    }
}