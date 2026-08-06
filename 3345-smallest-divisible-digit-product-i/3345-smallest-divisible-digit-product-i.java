class Solution {
    public static int prod(int n){
        int prd = 1;
        while(n>0){
            int temp = n%10;
            prd*=temp;
            n/=10;
        }
        return prd;
    }

    public int smallestNumber(int n, int t) {
        for(int i = n; i <= 100; i++){
            int prd = prod(i);
            if(prd%t==0) return i;
        }
        return -1;
    }
}