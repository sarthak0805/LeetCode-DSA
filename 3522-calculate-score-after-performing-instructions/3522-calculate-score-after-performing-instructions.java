class Solution {
    public long calculateScore(String[] instructions, int[] values) {
        int i = 0;
        int n = values.length;
        boolean flag[] = new boolean[n];
        Arrays.fill(flag,false);
        long ans = 0;
        while(i>=0 && i<n){
            if(flag[i] == true){
                break;
            }
            if(instructions[i].equals("add")){
                ans+=values[i];
                flag[i] = true;
                i++;
            }
            else{
                flag[i] = true;
                i = i+values[i];
            }
        }
        return ans;
    }
}