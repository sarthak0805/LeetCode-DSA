class Solution {
    static class Node{
        int num;
        int diff;
        public Node(int arr, int diff){
            this.num = arr;
            this.diff = diff;
        }
    }
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int diff[] = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            diff[i] = Math.abs(arr[i]-x);
        }
        PriorityQueue<Node> pq = new PriorityQueue<>((a,b) -> {
        if (a.diff == b.diff)
            return a.num - b.num;
        return a.diff - b.diff;
    });
        for(int i=0;i<arr.length;i++){
            pq.offer(new Node(arr[i],diff[i]));
        }
        List<Integer> l = new ArrayList<>();
        int idx = 0;
        while(idx<k){
            l.add(pq.poll().num);
            idx++;
        }
        Collections.sort(l);
        return l;
    }
}