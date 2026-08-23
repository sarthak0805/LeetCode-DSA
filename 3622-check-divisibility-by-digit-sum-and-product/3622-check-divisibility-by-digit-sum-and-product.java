class Solution {
    public int add(int n){
        int sum = 0;
        while(n>0){
            int rem = n%10;
            sum+=rem;
            n/=10;
        }
        return sum;
    }
    public long prd(int n){
        long sum = 1;
        while(n>0){
            long rem = n%10;
            sum*=rem;
            n/=10;
        }
        return sum;
    }
    public boolean checkDivisibility(int n) {
        int sum = add(n);
        long mul = prd(n);
        mul+=sum;
        return (n%mul==0);
    }
}