class Solution {
    public int maximumLengthSubstring(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int len = 0;
        int i = 0;
        char c = s.charAt(i);
        int n = s.length();
        for(int j = 0; j < n ; j++){
            char ch = s.charAt(j);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.get(ch)>2){
                if(map.get(s.charAt(i))==1) map.remove(s.charAt(i));
                else map.put(s.charAt(i),map.get(s.charAt(i))-1);
                i++;
            }
            len = Math.max(len,j-i+1);
        }
        return len;
    }
}