class Solution {
    public void setZeroes(int[][] matrix) {
        int rows=matrix.length;
        int cols=matrix[0].length;
         boolean[] rv = new boolean[rows];
	        boolean[] cv = new boolean[cols];

	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                if (matrix[i][j] == 0) {
	                    rv[i] = true;
	                    cv[j] = true;
	                }
	            }
	        }

	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < cols; j++) {
	                if (rv[i] || cv[j])
                     {
	                    matrix[i][j] = 0;
	                }
	            }
	        }
    }
}