class Solution {
    public int countCommas(int n) {
        if( n < 1000) return 0;
        if(n >= 1000 && n < 10000){
            return n-1000+1;
        }
        else if(n >= 10000 && n < 100000){
            return 9000 + n - 10000+1;
        }
        else return 99000+1;
    }
}