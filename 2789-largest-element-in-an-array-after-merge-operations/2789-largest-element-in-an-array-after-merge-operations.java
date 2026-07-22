class Solution {
    public long maxArrayValue(int[] nums) {
        int n = nums.length;
        long max = 0;
        for(int i : nums){
            max = Math.max(i,max);
        }
        long ans = nums[n-1];
        long nums1[] = new long[n];
        for(int i=0; i<n; i++){
            nums1[i] = nums[i];
        }
        for(int i = n - 2; i >= 0 ;i--){
            if(nums1[i]<=nums1[i+1]){
                nums1[i] = nums1[i] + nums1[i+1];
                ans = Math.max(ans,nums1[i]);
            }
        }
        return (ans<max)?max:ans;
    }
}