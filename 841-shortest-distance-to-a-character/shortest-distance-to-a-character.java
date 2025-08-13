class Solution {
    public int[] shortestToChar(String s, char c) {
        // int[] arr=new int[s.length()];
        
        // for(int i=0;i<s.length();i++)
        // {
        //     int co=0;
        //  for(int j=i;j<s.length();j++)
        // {
            
        //     if(s.charAt(j)==c)
        //     {
        //         break;
        //     }
        //     co++;
        // }   
        // arr[i]=co;
        // }
        // return arr;
         int n = s.length();
        int[] res = new int[n];
        int prev = Integer.MIN_VALUE / 2; 

       
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == c) {
                prev = i;
            }
            res[i] = i - prev;
        }
        prev = Integer.MAX_VALUE / 2;
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == c) {
                prev = i;
            }
            res[i] = Math.min(res[i], prev - i);
        }

        return res;
    }
}