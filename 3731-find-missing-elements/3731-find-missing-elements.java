class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min = 101;
        int max = 0;
        for(int x : nums){
            min = Math.min(min,x);
            max = Math.max(max,x);
        }
        Set<Integer> set = new HashSet<>();
        for(int i : nums) set.add(i);
        List<Integer> l = new ArrayList<>();
        for(int i = min;i <= max; i++){
            if(!set.contains(i)) l.add(i);
            else continue;
        }
        return l;
    }
}