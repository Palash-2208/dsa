class Solution {
    public boolean isPowerOfThree(int n) {
    //   if(n<1)return false;
    //     while(n>1)
    //     { 
    //         n=Math.abs(n/3);
    //     }
        
    //     return n==1;
    // return n==27;
      int maxPowerOfThree = 1162261467;
      return n > 0 && maxPowerOfThree % n == 0;
    }
}