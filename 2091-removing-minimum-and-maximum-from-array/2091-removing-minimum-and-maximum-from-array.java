class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ;i < n ; i++){
            min = Math.min(nums[i],min);
            max = Math.max(max,nums[i]);
            map.put(nums[i],i);
        }
        int min_idx = map.get(min);
        int max_idx = map.get(max);
        int start = Math.max(min_idx,max_idx)+1;
        int last = n - Math.min(max_idx,min_idx);
        int min_occ = Math.min(min_idx,max_idx);
        int max_occ = Math.max(min_idx,max_idx);
        int both = n-max_occ+min_occ+1;
        return Math.min(start,Math.min(both,last));
    }
}