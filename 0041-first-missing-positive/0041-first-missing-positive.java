class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i : nums){
            if(i<=0) continue;
            else{
                min = Math.min(min,i);
                max = Math.max(max,i);
                set.add(i);
            }
        }
        max = (max<0)?1:max;
         for(int i = 1 ; i <= max; i++){
            if(!set.contains(i)) return i;
        }
        return max+1;
    }
}