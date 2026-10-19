class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> foundone=new ArrayList<Integer>();
        Arrays.sort(nums);
        int loc=0;
        for(int i:nums)
        {
            if(i==target)
            {
                foundone.add(loc);

            }
            loc++;
        }
        return foundone;
    }
}