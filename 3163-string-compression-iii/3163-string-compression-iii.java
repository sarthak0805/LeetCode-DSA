class Solution {
    public String compressedString(String word) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < word.length(); i++){
            int cnt = 1;
            char ch = word.charAt(i);
            int j = i+1;
            while(j < word.length() && word.charAt(j) == ch && cnt<9){
                cnt++;
                j++;
            }
            i=j-1;
            sb.append(cnt);
            sb.append(ch);
        }
        return sb.toString();
    }
}