class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        long arr[] = new long[n];
        for(int i = 0; i < n; i++){
            arr[i] = nums[i]*nums[i];
        }
        Arrays.sort(arr);
        long sum = 0;
        int i = 0;
        int j = n-1;
        while(i<j){
            sum+=arr[j];
            sum-=arr[i];
            i++;
            j--;
        }
        if(n%2 != 0){
            sum+=arr[i];
        }
        return sum;
    }
}