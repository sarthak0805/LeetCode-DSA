class Solution {
    public int distinctSubseqII(String s) {
        int mod = 1000000007;
        long[] dp = new long[26];

        long total = 0;

        for (int i = 0; i < s.length(); i++) {

            int ch = s.charAt(i) - 'a';

            // Include s[i]
            long include = (total + 1) % mod;

            // Remove duplicate subsequences
            total = (total - dp[ch] + include + mod) % mod;

            // New subsequences ending with s[i]
            dp[ch] = include;
        }

        return (int) total;
    }
}