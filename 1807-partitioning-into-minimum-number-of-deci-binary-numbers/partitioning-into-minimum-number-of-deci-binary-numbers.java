class Solution {
    public int minPartitions(String n) {
       int an=0;
         for (int i = 0; i < n.length(); ++i) {
            an = Math.max(an, n.charAt(i) - '0');
        }
        return an;
    }
}