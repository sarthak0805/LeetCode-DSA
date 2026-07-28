class Solution {
    public String smallestPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        char ans[] = new char[n];
        int freq[] = new int[26];
        for(char ch : s.toCharArray()){
            freq[ch-'a']++;
        }
        int idxL = 0, idxR = n-1;
        for(int i = 0; i < 26; i++){
            int f = freq[i];
            while(f>=2){
                ans[idxL++] = (char)('a'+i);
                ans[idxR--] = (char)('a'+i);
                f-=2;
            }
            if(freq[i]%2==1){
                ans[n/2] = (char)('a'+i);
            }
        }
        for(int i = 0; i < ans.length; i++){
            sb.append(ans[i]);
        }
        return sb.toString();
    }
}