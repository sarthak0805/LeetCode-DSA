class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int op = 0;
        int prev = nums[0];
        for(int i = 1; i<nums.length;i++){
            int curr = nums[i];
            if(curr>prev){
                prev=curr;
            }
            else{
                int add = prev+1-curr;
                op+=add;
                prev += 1;
            }
        }
        return op;
    }
}