class Solution {
    public int numberOfSubstrings(String s) {
        int cnt = 0;
        int freq[] = {-1,-1,-1};
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a'] = i;
            cnt+=Math.min(freq[0],Math.min(freq[1],freq[2]))+1;
        }
        return cnt;
    }
}