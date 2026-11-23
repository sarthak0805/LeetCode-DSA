class ProductOfNumbers {
    List<Integer> l = new ArrayList<>();
    public ProductOfNumbers() {
        
        l.add(1);
    }
    
    public void add(int num) {
        if(num == 0){
            l.clear();
            l.add(1);
        }
        else{
            int last = l.get(l.size()-1);
            l.add(num*last);
        }
    }
    
    public int getProduct(int k) {
        if(k >= l.size()) return 0;
        int prd = l.get(l.size()-1)/l.get(l.size() - 1 - k);
        return prd;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */