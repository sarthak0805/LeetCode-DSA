class Solution {
    public int numberOfSubstrings(String s) {
        int cnt = 0;
        Set<Character> set = new HashSet<>();
        int freq[] = new int[3];
        int l = 0;
        int r = 0;
        while(r<s.length()){
            char ch = s.charAt(r);
            freq[ch-'a']++;
            while(freq[0]>0 && freq[1]>0 && freq[2]>0){
                cnt+=s.length()-r;
                char leftch = s.charAt(l);
                freq[leftch-'a']--;
                l++;
            }
            r++;
        }
        return cnt;
    }
}