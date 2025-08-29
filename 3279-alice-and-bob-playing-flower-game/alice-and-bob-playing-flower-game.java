class Solution {
    public long flowerGame(int n, int m) {
        long evenX = n / 2;
        long oddX = n - evenX;
        long evenY = m / 2;
        long oddY = m - evenY;
        return oddX * evenY + evenX * oddY; 
    }
}