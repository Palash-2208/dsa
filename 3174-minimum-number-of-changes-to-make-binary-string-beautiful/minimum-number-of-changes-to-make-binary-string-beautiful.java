class Solution {
    public int minChanges(String s) {
        int chng=0;
        for(int i=0;i<s.length();i+=2)
        {
            if(s.charAt(i)!=s.charAt(i+1))chng+=1;
        }return chng;
    }
}