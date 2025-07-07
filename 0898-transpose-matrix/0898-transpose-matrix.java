class Solution {
    public int[][] transpose(int[][] matrix) {
        int rows=matrix.length;
        int columns=matrix[0].length;
        int[][] new_mat=new int[columns][rows];
        // System.out.println(rows);
        // System.out.println(columns);
        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                new_mat[j][i]=matrix[i][j];
            }
        }
        return new_mat;
    }
}