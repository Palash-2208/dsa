class Solution {
    public int search(int[] nums, int target) {
        // for(int i=0;i<nums.length;i++)
        // {
        //     if(nums[i]==target)return i;
        // }
        // return -1;
        int l=0,r=nums.length-1;
        while(l<=r)
        {
            int mid = l + (r - l)/2;

            if(nums[mid]==target)
            {
                return mid;
            }
            if(nums[mid]<target)
            {
                l=mid+1;

            }else
            {
                r=mid-1;
            }
        }
        return -1;
    }
}