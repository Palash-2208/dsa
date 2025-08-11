class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) 
    {
        int[] res=new int[2];
        Map<Integer,Integer> map=new HashMap();
        System.out.println(grid.length);
       for(int i=0;i<grid.length;i++){
        for(int j=0;j<grid.length;j++){
            map.put(grid[i][j],map.getOrDefault(grid[i][j],0)+1);
            if(map.get(grid[i][j])==2)  
            res[0]=grid[i][j];
        }
       }
        for(int i=1;i<=grid.length*grid.length;i++){
            if(!map.containsKey(i)) {
                res[1]=i;
                break;
            }
        }return res;
    }
}
        
 