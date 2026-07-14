class Solution {
    public int maxSubArray(int[] nums) {
        int cs = 0;
        int ms = Integer.MIN_VALUE;
        for(int i : nums){
            cs+=i;
            ms=Math.max(ms,cs);
            if(cs<0) cs = 0;
        }
        return (ms==Integer.MIN_VALUE)?cs:ms;
    }
}