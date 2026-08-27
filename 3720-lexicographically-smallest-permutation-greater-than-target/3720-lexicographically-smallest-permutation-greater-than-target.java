class Solution {
    public String lexGreaterPermutation(String s, String target) {
        int n = s.length();
        int freq[] = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        char res[] = new char[n];
        int len = 0;
        for (int i = 0; i < n; i++) {
            int targetIdx = target.charAt(i) - 'a';
            if (freq[targetIdx] > 0) {
                res[i] = target.charAt(i);
                freq[targetIdx]--;
                len++;
            } else {
                break;
            }
        }
        for (int i = Math.min(len, n - 1); i >= 0; i--) {
            if (i < len) {
                freq[target.charAt(i) - 'a']++;
            }
            int minCharIdxToBeat = target.charAt(i) - 'a';
            for (int c = minCharIdxToBeat + 1; c < 26; c++) {
                if (freq[c] > 0) {
                    res[i] = (char) ('a' + c);
                    freq[c]--;

                    int idx = i + 1;
                    for (int j = 0; j < 26; j++) {
                        while (freq[j] > 0) {
                            res[idx++] = (char) ('a' + j);
                            freq[j]--;
                        }
                    }
                    return new String(res);
                }
            }
        }
        return "";
    }
}
