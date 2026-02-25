class Solution {
    public int[] sortByBits(int[] arr) {
        Integer[] nn=new Integer[arr.length];
        for(int i=0;i<arr.length;i++)
        {
        nn[i]=arr[i];
        }
        Arrays.sort(nn, (a, b) -> {
            int counta = Integer.bitCount(a);
            int countb = Integer.bitCount(b);
            if (counta == countb) {
                return a.compareTo(b);
            }
            return Integer.compare(counta, countb);
        });
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=nn[i];
        }
        return arr;

    }
}