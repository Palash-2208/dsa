class Solution {
    public int findKthPositive(int[] arr, int k) {
        int count=0;
        for(int i=0;i<arr.length;i++){
           count=arr[i]-i-1;
           if(count==k) return arr[i]-1;
          else if(count>k) return arr[i]-1-count+k;
        }
        if(count<k) return arr[arr.length-1]+k-count;
        return -1;
    }
}