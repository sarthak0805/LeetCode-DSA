class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        Arrays.sort(arr);
        int prev = arr[0];
        if(arr[0]!=1) arr[0] = 1;
        if(prev != 1) prev = 1;
        for(int i = 1; i < arr.length; i++){
            int curr = arr[i];
            if(Math.abs(curr-prev)<=1){
                prev = arr[i];
            }
            else{
                arr[i] = prev+1;
                prev = arr[i];
            }
        } 
        return arr[arr.length-1];
    }
}