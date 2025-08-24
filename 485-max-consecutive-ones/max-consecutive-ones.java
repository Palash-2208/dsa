class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int s=0;
        for(int i:nums)
        {
            if(i!=0)
            {
            s+=i;
            max=Math.max(max,s);
            }
            else
            {
                int temp=s;
                max=Math.max(temp,max);
                s=0;

            }
           
        }
         return max;

    }
}