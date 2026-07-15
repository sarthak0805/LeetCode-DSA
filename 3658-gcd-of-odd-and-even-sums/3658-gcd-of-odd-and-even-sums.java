class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sum_odd = 0; 
        int sum_even = 0;
        int odd = 1;
        int even = 2;
        while(n>0){
            sum_odd+=odd;
            sum_even+=even;
            odd+=2;
            even+=2;
            n--;
        }
        int gcd = 1;
        for(int i = 1; i<=Math.min(sum_odd,sum_even); i++){
            if(sum_even%i == 0 && sum_odd%i == 0){
                gcd = i;
            }
        }
        return gcd;
    }
}