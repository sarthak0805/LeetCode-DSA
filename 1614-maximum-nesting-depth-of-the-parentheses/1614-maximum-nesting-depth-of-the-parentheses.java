class Solution {
    public int maxDepth(String s) {
        int left = 0;
        int right  = 0;
        int max = 0;
        for(char c : s.toCharArray()){
            if(c == ')') right++;
            else if(c == '(') left++;
            max = Math.max(left-right,max);
        }
        return max;
    }
}