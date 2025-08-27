class Solution {
    public int secondHighest(String s) {
        char[] ch=s.toCharArray();
        int max=0;
        int first=-1;
        int second=-1;
          for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                int digit = c - '0';

                if (digit > first) {
                    second = first;
                    first = digit;
                } else if (digit < first && digit > second) {
                    second = digit;
                }
            }
        }

        return second;
    }
}