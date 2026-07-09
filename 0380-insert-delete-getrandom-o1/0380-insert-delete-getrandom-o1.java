class RandomizedSet {
    public Set<Integer> set;
    public List<Integer> list;
    public Map<Integer,Integer> map;
    public RandomizedSet() {
        set = new HashSet<>();
        list = new ArrayList<>();
        map = new HashMap<>();
    }
    
    public boolean insert(int val) {
        if(set.contains(val)) return false;
        set.add(val);
        list.add(val);
        map.put(val,list.size()-1);
        return true;
    }
    
    public boolean remove(int val) {
        if (!set.contains(val)) return false;
    int idx = map.get(val);
    int last = list.get(list.size() - 1);
    list.set(idx, last);
    map.put(last, idx);
    list.remove(list.size() - 1);
    map.remove(val);
    set.remove(val);
    return true;
    }
    
    public int getRandom() {
        Random rand = new Random();
        return list.get(rand.nextInt(list.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */