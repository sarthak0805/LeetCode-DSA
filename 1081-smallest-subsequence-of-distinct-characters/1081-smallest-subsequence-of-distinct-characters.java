class Solution {
    public String smallestSubsequence(String s) {
        Stack<Character> st = new Stack<>();
        int freq[] = new int[26];
        for(int i = 0;i < s.length();i++){
            char ch = s.charAt(i);
            freq[ch-'a']++;
        }
        boolean visited[] = new boolean[26];
        for(char ch : s.toCharArray()){
            int idx = ch-'a';
            freq[idx]--;
            if(visited[idx]){
                continue;
            }
            while(!st.isEmpty() && st.peek()>ch && freq[st.peek() - 'a'] > 0){
                visited[st.pop()-'a'] = false;
                }
            st.push(ch);
            visited[idx] = true;
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}