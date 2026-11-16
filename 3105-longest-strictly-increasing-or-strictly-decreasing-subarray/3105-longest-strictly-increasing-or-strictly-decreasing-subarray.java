class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n = nums.length;
        int j = 0;
        if(n==1) return 1;
        int increase = 1, decrease = 1;
        for(int i = 1; i < n; i++){
            if(nums[i]>nums[i-1]){
                increase = Math.max(i-j+1,increase);
                continue;
            }
            else {
                j = i;
            } 
        }
        j = 0;
        for(int i = 1; i < n; i++){
            if(nums[i]<nums[i-1]){
                decrease = Math.max(i-j+1,decrease);
                continue;
            }
            else {
                j = i;
            } 
        }
        return Math.max(increase,decrease);
    }
}