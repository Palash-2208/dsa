class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> find=new ArrayList<Integer>();
        for(int i=0;i<words.length;i++)
        {
            if(words[i].contains(String.valueOf(x)))
            {
                find.add(i);
            }

        }
        return find;
    }
}