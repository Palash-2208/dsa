class Solution {
    public int findShortestSubArray(int[] nums) {
     Map<Integer, Integer> countMap = new HashMap<>();
        Map<Integer, Integer> firstIndex = new HashMap<>();
        Map<Integer, Integer> lastIndex = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            
            if (!firstIndex.containsKey(num)) {
                firstIndex.put(num, i);
            }
            lastIndex.put(num, i);
        }
        
        int degree = Collections.max(countMap.values());
        int minLength = nums.length;
        
        for (int num : countMap.keySet()) {
            if (countMap.get(num) == degree) {
                int length = lastIndex.get(num) - firstIndex.get(num) + 1;
                minLength = Math.min(minLength, length);
            }
        }
        
        return minLength;
    }
}