class Solution {
    public static int solve(String s, String t, int dp[][], int i, int j){
        if(j == t.length()) return 1;
        if(i == s.length()) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        int include = 0;
        if(s.charAt(i) == t.charAt(j)){
            include = solve(s,t,dp,i+1,j+1);
        }
        int exclude = solve(s,t,dp,i+1,j);
        dp[i][j] = include+exclude;
        return dp[i][j];
    }
    public int numDistinct(String s, String t) {
        int n = s.length();
        int m = t.length();
        if(m > n) return 0;
        int dp[][] = new int[n][m];
        for(int d[] : dp){
            Arrays.fill(d, -1);
        }
        int ans = solve(s,t,dp,0,0);
        return ans;
    }
}