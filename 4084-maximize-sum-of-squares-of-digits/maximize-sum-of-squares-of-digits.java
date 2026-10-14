class Solution {
    public String maxSumOfSquares(int num, int sum) {
         if (sum > (long) num * 9) {
            return "";
        }

        char[] res = new char[num];
        int nines = sum / 9;
        int rem = sum % 9;
        int idx = 0;

        for (int i = 0; i < nines; i++) {
            res[idx++] = '9';
        }

        if (rem > 0) {
            res[idx++] = (char) ('0' + rem);
        }

        while (idx < num) {
            res[idx++] = '0';
        }
       
      
        return new String(res);
    }
}