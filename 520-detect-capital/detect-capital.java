class Solution {
    public boolean detectCapitalUse(String word) {
      if (word.equals(word.toUpperCase())) {
            return true;
        }

        if (word.equals(word.toLowerCase())) {
            return true;
        }
           String firstLetter = word.substring(0, 1);
        String restLetters = word.substring(1);

        if (firstLetter.equals(firstLetter.toUpperCase()) &&
            restLetters.equals(restLetters.toLowerCase())) {
            return true;
        }
        return false;

    }
}