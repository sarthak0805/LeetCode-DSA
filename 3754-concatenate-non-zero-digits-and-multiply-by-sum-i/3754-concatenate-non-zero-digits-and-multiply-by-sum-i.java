class Solution {
    public long sumAndMultiply(int n) {
        if(n==0) return 0;
        long sum = 0;
        StringBuilder sb1 = new StringBuilder();
        sb1.append(n);
        StringBuilder sb2 = new StringBuilder();
        for(char c : sb1.toString().toCharArray()){
            if(c=='0') continue;
            sb2.append(c);
            int x = c-'0';
            sum+=x;
        }
        int num = Integer.parseInt(sb2.toString());
        return num*sum;
    }
}