class SmallestInfiniteSet {
    Set<Integer> set;
    int min;
    List<Integer> l;
    public SmallestInfiniteSet() {
        set = new HashSet<>();
        min = Integer.MAX_VALUE;
        l = new ArrayList<>();
        for(int i = 1; i <= 1000; i++){
            set.add(i);
            l.add(i);
        }
    }
    
    public int popSmallest() {
        int num = l.get(0);
        l.remove(0);
        set.remove(num);
        return num;
    }
    
    public void addBack(int num) {
        if(!set.contains(num)) {set.add(num);
        l.add(num);}
        Collections.sort(l);
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */