class Solution {
    public int[] singleNumber(int[] nums) {
        int ans[] = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        for(int x : nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        List<Integer> l = new ArrayList<>();
        for(int x : map.keySet()){
            if(map.get(x)==1){
                l.add(x);
            }
        }
        ans[0] = l.get(0);
        ans[1] = l.get(1);
        return ans;
    }
}