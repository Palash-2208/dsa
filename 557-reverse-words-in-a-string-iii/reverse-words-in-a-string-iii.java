class Solution {
    public String reverseWords(String s) {
        String in[]=s.split(" ");
        StringBuilder result = new StringBuilder();
        for(int i=0;i<in.length;i++)
        {
              StringBuilder sb = new StringBuilder(in[i]);
            result.append(sb.reverse());
            if (i != in.length - 1) {
                result.append(" "); 
            }
        }
        return result.toString();
        
    }
}