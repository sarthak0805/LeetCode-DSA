class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String,Integer> map = new HashMap<>();
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < list1.length; i++){
            map.put(list1[i],i);
        }
        Map<String,Integer> m1 = new HashMap<>();
        for(int j = 0; j < list2.length; j++){
            if(map.containsKey(list2[j])){
                min = Math.min(min,map.get(list2[j])+j);
                m1.put(list2[j],map.get(list2[j])+j);
            }
            else continue;
        }
        List<String> ans = new ArrayList<>();
        for(String x : m1.keySet()){
            if(min == m1.get(x)) ans.add(x);
        }
        String answ[] =  new String[ans.size()];
        for(int i = 0; i < ans.size(); i++){
            answ[i] = ans.get(i);
        }
        return answ;
    }
}