class Solution {
    public static int gcd(int a, int b){
        while(b!=0){
            int temp = b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public long gcdSum(int[] nums) {
        int n = nums.length;
        int prefix[] = new int[n];
        int max = nums[0];
        for(int i=0;i<n;i++){
            max = Math.max(max,nums[i]);
            prefix[i] = gcd(nums[i],max);
        }
        Arrays.sort(prefix);
        int i=0, j= n-1;
        long sum = 0;
        while(i<j){
            sum+=gcd(prefix[i],prefix[j]);
            i++;
            j--;
        }
        return sum;
    }
}