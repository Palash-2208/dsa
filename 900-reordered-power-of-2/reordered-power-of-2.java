class Solution {
    public boolean reorderedPowerOf2(int n) {
     Set<String> powerSet = new HashSet<>();
       
        for (int i = 0; i < 31; i++) {  
            int power = 1 << i;
            char[] digits = String.valueOf(power).toCharArray();
            Arrays.sort(digits);
            powerSet.add(new String(digits));
        }
        
        
        char[] nDigits = String.valueOf(n).toCharArray();
        Arrays.sort(nDigits);
        return powerSet.contains(new String(nDigits));}}