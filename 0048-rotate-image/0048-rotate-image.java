class Solution {
    // if you observe the matrix carefully 
    // then you can see that we first take the transpose
    // and then take the mirror
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        
        transpose(matrix, n);
        reflect(matrix, n);
    }
    
    private void transpose(int[][] matrix, int n){
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
    
    private void reflect(int[][] matrix, int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n / 2; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - j - 1];
                matrix[i][n - j - 1] = temp;
            }
        }
    }
}