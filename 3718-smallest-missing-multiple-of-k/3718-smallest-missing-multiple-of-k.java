class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for(int x : nums){
            set.add(x);
        }
        for(int i = 1; i <= 1000; i++){
            if(i%k == 0){
                if(!set.contains(i)) return i;
            }
        }
        return -1;
    }
}