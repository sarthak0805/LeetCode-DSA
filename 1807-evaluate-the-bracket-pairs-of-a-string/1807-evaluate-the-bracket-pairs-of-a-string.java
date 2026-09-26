class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String,String> map = new HashMap<>();
        for(List<String> l : knowledge){
            map.put(l.get(0),l.get(1));
        }
        List<Integer> open = new ArrayList<>();
        List<Integer> close = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {

                int j = i + 1;

                while (s.charAt(j) != ')') {
                    j++;
                }

                String key = s.substring(i + 1, j);

                if (map.containsKey(key))
                    sb.append(map.get(key));
                else
                    sb.append("?");

                i = j;
            }
            else {
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();


    }
}