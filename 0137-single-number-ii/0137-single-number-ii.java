class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> m = new HashMap<>();
        for(int x : nums){
            m.put(x,m.getOrDefault(x,0)+1);
        }
        for(int x : m.keySet()){
            if(m.get(x)==1) return x;
        }
        return 0;
    }
}