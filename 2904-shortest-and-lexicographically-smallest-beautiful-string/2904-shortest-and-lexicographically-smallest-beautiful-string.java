class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int n = s.length();
        String ans = "";
        for(int i = 0; i < n ; i++){
            int cnt = 0;
            StringBuilder sb = new StringBuilder();
            for(int j = i; j < n; j++){
                sb.append(s.charAt(j));
                if(s.charAt(j) == '1') cnt++;

                if(cnt > k) break;

                if(cnt == k){
                    String str = sb.toString();
                if(ans.isEmpty() || str.length()<ans.length() || (str.length()==ans.length() && str.compareTo(ans) < 0)) {ans = str;}
                }
            }
        }
        return ans;
    }
}