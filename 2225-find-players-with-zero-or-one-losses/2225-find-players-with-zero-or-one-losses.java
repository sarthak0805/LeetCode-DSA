class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        Set<Integer> win = new HashSet<>();
        Set<Integer> loss = new HashSet<>();
        Map<Integer,Integer> lose = new HashMap<>(); 
        List<Integer> w = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        for(int i = 0;i<matches.length;i++){
            win.add(matches[i][0]);
            loss.add(matches[i][1]);
            lose.put(matches[i][1],lose.getOrDefault(matches[i][1],0)+1);
        }
        win.removeAll(loss);
        for(int x : win){
            w.add(x);
        }
        for(int i : lose.keySet()){
            if(lose.get(i) == 1){
                l.add(i);
            }
        }
        List<List<Integer>> ans = new ArrayList<>();
        Collections.sort(w);
        Collections.sort(l);
        ans.add(w);
        ans.add(l);
        return ans;
    }
}