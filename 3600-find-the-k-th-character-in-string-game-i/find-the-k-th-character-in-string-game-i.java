class Solution {
     private char nextChar(char c) {
        return c == 'z' ? 'a' : (char)(c + 1);
    }
    private String getNext(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            sb.append(nextChar(c));
        }
        return sb.toString();
    }

    public char kthCharacter(int k) {
        StringBuilder word = new StringBuilder("a");

        while (word.length() < k) {
            String nextPart = getNext(word.toString());
            word.append(nextPart);
        }

        return word.charAt(k - 1); 
    }
}