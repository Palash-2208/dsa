class Solution {
    public int firstUniqChar(String s) {
        if(s.length()==0)return -1;
       char c[]=s.toCharArray();
       HashMap<Character,Integer> check=new HashMap<>();
       for(char d:c)
       {
        check.put(d,check.getOrDefault(d,0)+1);
     }
      for (int i = 0; i < c.length; i++) {
            if (check.get(c[i]) == 1) {
                return i;
            }
        }

        return -1; 

    }
}