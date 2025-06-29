class Solution {
    public int thirdMax(int[] nums) {
     TreeSet<Integer> ts = Arrays.stream(nums)    // Create stream from int array
                            .boxed()         // Convert int to Integer
                            .collect(Collectors.toCollection(TreeSet::new)); // Collect to TreeSet

        List<Integer> list = new ArrayList<>(ts);

if(list.size()>=3)return list.get(list.size()-3);
return list.get(list.size()-1);
    }
}