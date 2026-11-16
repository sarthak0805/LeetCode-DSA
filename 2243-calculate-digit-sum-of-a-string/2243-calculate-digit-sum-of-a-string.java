class Solution {
    public static List<String> group(String s, int k){
        List<String> l = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            sb.append(ch);
            if(sb.length()==k){
                l.add(sb.toString());
                sb = new StringBuilder();
            }
        }
        if(sb.length()>0) l.add(sb.toString());
        return l;
    }
    public static String addDigit(String s){
        int sum = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            int dig = ch - '0';
            sum += dig;
            char chadd = (char)(sum + '0');
            sb.append(chadd);
        }
        return String.valueOf(sum);
    }
    public String digitSum(String s, int k) {
        StringBuilder sb = new StringBuilder(s);
        while(sb.length()>k){
            List<String> l = group(sb.toString(),k);
            sb = new StringBuilder();
            for(String st : l){
                String add = addDigit(st);
                sb.append(add);
            }
        }
        return sb.toString();
    }
}