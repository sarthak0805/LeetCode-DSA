class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        if(n == 1) return intervals;
        Arrays.sort(intervals, Comparator.comparingInt(o->o[0]));
        List<int[]> l = new ArrayList<>();
        int st = intervals[0][0];
        int end = intervals[0][1];
        for(int i = 1; i < n; i++){
            int curr_st = intervals[i][0];
            int curr_end = intervals[i][1];
            if(curr_st<=end){
                end = Math.max(end,curr_end);
            }
            else{
                l.add(new int[]{st,end});
                st = curr_st;
                end = curr_end;
            }
        }
        l.add(new int[]{st,end});
        int ans[][] = new int[l.size()][2];
        for(int i = 0; i < l.size(); i++){
            ans[i] = l.get(i);
        }
        return ans;
    }
}