class Solution {
    public static boolean isSorted(int nums[]){
        int arr[] = new int[nums.length*2];
        int idx = 0;
        for(int i = 0; i < nums.length; i++){
            arr[idx++] = nums[i];
        }
        for(int i = 0 ; i < nums.length; i++){
            arr[idx++] = nums[i];
        }
        int cnt = 1;
        for(int i = 0; i < arr.length-1; i++){
            if(cnt  == nums.length) return true;
            if(arr[i] <= arr[i + 1]){
                cnt++;
                continue;
            }
            else cnt = 1;
        }
        return false;
    }
    public int sortableIntegers(int[] nums) {
        int n = nums.length;
        List<Integer> l = new ArrayList<>();
        for(int i = 1 ; i <= n; i++){
            if(n%i == 0) l.add(i);
        }
        int ans = 0;

        for (int k : l) {
            boolean valid = true;
            int prevMax = Integer.MIN_VALUE;

            for (int start = 0; start < n; start += k) {
                int[] block = Arrays.copyOfRange(nums, start, start + k);

                if (!isSorted(block)) {
                    valid = false;
                    break;
                }

                int min = Integer.MAX_VALUE;
                int max = Integer.MIN_VALUE;

                for (int x : block) {
                    min = Math.min(min, x);
                    max = Math.max(max, x);
                }

                if (prevMax > min) {
                    valid = false;
                    break;
                }

                prevMax = max;
            }

            if (valid) ans += k;
        }

        return ans;
    }
}