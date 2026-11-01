class Solution {
    public static boolean isEqual(int nums[]){
        int n = nums.length;
        for(int i = 1; i < n; i++){
            if(nums[i]!=nums[i-1]) return false;
        }
        return true;
    }
    public int minMoves(int[] nums) {
        int n = nums.length;
        // if(isEqual(nums)) return 0;
        int min = Integer.MAX_VALUE;
        for(int i : nums){
            min = Math.min(min,i);
        }
        int cnt = 0;
        for(int i = 0; i <  n; i++){
            cnt+= (Math.abs(min-nums[i]));
        }
        return cnt;
    }
}