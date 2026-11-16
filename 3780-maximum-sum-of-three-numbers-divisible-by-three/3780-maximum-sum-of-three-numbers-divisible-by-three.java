class Solution {
    public int maximumSum(int[] nums) {
        List<Integer> l0 = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        for(int x : nums){
            if(x%3 == 0) l0.add(x);
            else if(x % 3 == 1) l1.add(x);
            else l2.add(x);
        }
        Collections.sort(l0);
        Collections.sort(l1);
        Collections.sort(l2);
        int sum0 = 0, sum1 = 0, sum2 = 0;
        if(l0.size()>=3){
            int cnt = 0;
            for(int i = l0.size()-1; i >= 0; i--){
                if(cnt == 3) break;
                sum0 += l0.get(i);
                cnt++;
            }
        }
        if(l1.size()>=3){
            int cnt = 0;
            for(int i = l1.size()-1; i >= 0; i--){
                if(cnt == 3) break;
                sum1 += l1.get(i);
                cnt++;
            }
        }
        if(l2.size()>=3){
            int cnt = 0;
            for(int i = l2.size()-1; i >= 0; i--){
                if(cnt == 3) break;
                sum2 += l2.get(i);
                cnt++;
            }
        }
        int result = Math.max(sum0, Math.max(sum1, sum2));

        if(!l0.isEmpty() && !l1.isEmpty() && !l2.isEmpty()){
            result = Math.max(result,
                l0.get(l0.size()-1) +
                l1.get(l1.size()-1) +
                l2.get(l2.size()-1));
        }
        return result;
    }
}