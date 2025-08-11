class Solution {
    public boolean isMonotonic(int[] nums) {
      int a=0,d=0;
        for (int i=0;i<nums.length-1;i++)
        {
            
            
            if(nums[i]<=nums[i+1])
            {
              a++;
            }
             if(nums[i]>=nums[i+1])
            {
                d++;
            
        
        }
        
        }
        if(a==nums.length-1 || d==nums.length-1)
        {
            return true;
        }
        return false;


    }
}