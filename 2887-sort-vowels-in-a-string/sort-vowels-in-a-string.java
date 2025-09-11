class Solution {
    private static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
    public String sortVowels(String s) {
         StringBuilder sb = new StringBuilder(s);

       
        List<Character> vowels = new ArrayList<>();
        for (char c : s.toCharArray()) {
            if (isVowel(c)) {
                vowels.add(c);
            }
        }
        vowels.sort((a, b) -> a - b);

        int vowelIndex = 0;
        for (int i = 0; i < sb.length(); i++) {
            if (isVowel(sb.charAt(i))) {
                sb.setCharAt(i, vowels.get(vowelIndex++));
            }
        }

        return sb.toString();
    }
    }
