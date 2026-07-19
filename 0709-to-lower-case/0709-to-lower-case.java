class Solution {
    public String toLowerCase(String s) {
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            if(Character.isUpperCase(c)){
                c=(char)(c+32);
            }
            sb.append(c);
        }
        return sb.toString();
    }
}