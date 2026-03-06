class Solution {
    public boolean buddyStrings(String s, String goal) {
         if(s.length() != goal.length()) {
            return false;
        }
        int[] inputFreq = new int[26];
        for(char ch : s.toCharArray()) {
            inputFreq[ch - 'a']++;
        }
        int[] goalFreq = new int[26];
        for(char ch : goal.toCharArray()) {
            goalFreq[ch - 'a']++;
        }
        int index = 0;
        while(index < 26) {
            if(inputFreq[index] != goalFreq[index]) {
                return false;
            }
            index++;
        }
        if (s.equals(goal)) {
            for (int count : inputFreq) {
                if (count >= 2) {
                    return true;
                }
            }
            return false;
        }
        int diffCount = 0;        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                diffCount++;
                if (diffCount > 2) {
                    return false; 
                }
            }
        }

        return true;
    }
}