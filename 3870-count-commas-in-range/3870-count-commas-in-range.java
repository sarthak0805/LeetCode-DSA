class Solution {
    public int countCommas(int n) {
        String s = String.valueOf(n);
        if(s.length() < 4) return 0;
        if(s.length() == 4){
            return n-1000+1;
        }
        else if(s.length() == 5){
            return 9000 + n - 10000+1;
        }
        else return 99000+1;
    }
}