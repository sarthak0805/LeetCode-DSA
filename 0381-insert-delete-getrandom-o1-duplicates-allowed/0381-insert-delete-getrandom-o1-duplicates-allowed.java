class RandomizedCollection {
    public List<Integer> list;
    public Map<Integer,List<Integer>> map;
    public RandomizedCollection() {
        list = new ArrayList<>();
        map = new HashMap<>();
    }
    
    public boolean insert(int val) {
        list.add(val);
        int idx = list.size()-1;
        if(!map.containsKey(val)){
            map.put(val,new ArrayList<>());
            map.get(val).add(idx);
            return true;
        }
        map.get(val).add(idx);
        return false;
    }
    
    public boolean remove(int val) {
        if(!map.containsKey(val)) return false;
         List<Integer> idxList = map.get(val);
        int idx = idxList.get(idxList.size() - 1);
        idxList.remove(idxList.size() - 1);

        int last = list.get(list.size() - 1);

        if (idx != list.size() - 1) {

            list.set(idx, last);

            List<Integer> lastList = map.get(last);

            lastList.remove(Integer.valueOf(list.size() - 1));
            lastList.add(idx);
        }

        list.remove(list.size() - 1);

        if (idxList.isEmpty())
            map.remove(val);
        return true;
    }
    
    public int getRandom() {
        Random rand = new Random();
        return list.get(rand.nextInt(list.size()));
    }
}

/**
 * Your RandomizedCollection object will be instantiated and called as such:
 * RandomizedCollection obj = new RandomizedCollection();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */