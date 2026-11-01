class Solution {
    public long dividePlayers(int[] skill) {
        int n = skill.length;
        if(n==2){
            return skill[0]*skill[1];
        }
        Arrays.sort(skill);
        int i = 1;
        int j = n-2;
        long sum = 0;
        long currsum = 0;
        long oldsum = 0;
        currsum = skill[0] + skill[n-1];
        oldsum = currsum;
        while(i<=j){
            currsum = skill[i]+skill[j];
            if(oldsum!=currsum) return -1;
            oldsum = currsum;
            i++;
            j--;
        }
        i = 0;
        j = n - 1;
        while(i <= j){
            sum += skill[i]*skill[j];
            i++;
            j--;
        }
        return sum;
    }
}