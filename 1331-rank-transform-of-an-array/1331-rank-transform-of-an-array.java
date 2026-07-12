class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        Map<Integer,Integer> map = new HashMap<>();
        int sort[] = Arrays.copyOf(arr,n);
        Arrays.sort(sort);
        int r = 1;
        for(int i = 0;i<n;i++){
            if(!map.containsKey(sort[i])){
                map.put(sort[i],r++);
            }
        }
        int rank[] = new int[n];
        for(int i = 0;i<n;i++){
            rank[i] = map.get(arr[i]);
        }
        return rank;
    }
}