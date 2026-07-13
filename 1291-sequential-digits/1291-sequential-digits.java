class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans = new ArrayList<>();

        for(int len = String.valueOf(low).length(); len <= String.valueOf(high).length(); len++){
            for(int st = 1; st <= 10 - len; st++){

                StringBuilder sb = new StringBuilder();
                int curr = st;

                for(int i = 0; i < len; i++){
                    sb.append(curr);
                    curr++;
                }

                int n = Integer.parseInt(sb.toString());

                if(n >= low && n <= high){
                    ans.add(n);
                }
            }
        }

        return ans;
    }
}