class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        int len = 0;
        int i = 0;
        for(int j = 0; j < n; j++){            
            map.put(nums[j],map.getOrDefault(nums[j],0)+1);
                while(map.get(nums[j])>k){
                    if(map.get(nums[i])==1){
                        map.remove(nums[i]);
                    }
                    else map.put(nums[i],map.get(nums[i])-1);
                    i++;
                }
            len = Math.max(len,j-i+1);
        }
        return len;
    }
}