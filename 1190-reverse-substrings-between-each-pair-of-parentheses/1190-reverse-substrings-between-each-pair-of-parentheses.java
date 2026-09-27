class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == ')') {

                StringBuilder temp = new StringBuilder();

                while (st.peek() != '(') {
                    temp.append(st.pop());
                }

                // Remove '('
                st.pop();

                // Put reversed content back
                for (int j = 0; j < temp.length(); j++) {
                    st.push(temp.charAt(j));
                }

            } else {
                st.push(ch);
            }
        }

        StringBuilder ans = new StringBuilder();

        while (!st.isEmpty()) {
            ans.append(st.pop());
        }

        return ans.reverse().toString();
    }
}