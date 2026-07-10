class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        int idx = 0;
        for(int i : nums){
            if(i%2==0){
                ans[idx++] = i;
            }
        }
        for(int i : nums){
            if(i%2!=0){
                ans[idx++] = i;
            }
        }
        return ans;
    }
}