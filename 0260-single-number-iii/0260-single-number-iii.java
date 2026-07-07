class Solution {
    public int[] singleNumber(int[] nums) {
        int ans[] = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        for(int x : nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        int idx = 0;
        for(int x : map.keySet()){
            if(map.get(x)==1){
                ans[idx++] = x;
            }
        }
        return ans;
    }
}