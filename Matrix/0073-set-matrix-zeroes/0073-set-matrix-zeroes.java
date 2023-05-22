class Solution {
    public void setZeroes(int[][] matrix) {
        Boolean isCol = false;
        int R = matrix.length;
        int C = matrix[0].length;
        
        for(int i = 0; i < R; i++){
            // check the first column
            if(matrix[i][0] == 0){
                isCol = true;
            }
            
            for(int j = 1; j < C; j++){
                // if an element is 0, we set the first element of the corresponding row and column to 0
                if(matrix[i][j] == 0){
                    matrix[0][j] = 0; 
                    matrix[i][0] = 0;
                }
            }
        }
        // iterate over the array once again and using the first row and first column, update the elements
        for(int i = 1; i < R; i++){
            for(int j = 1; j < C; j++){
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }
        
        // see if the first row needs to be set to zero as well
        if(matrix[0][0] == 0){
            for(int j = 0; j < C; j++){
                matrix[0][j] = 0;
            }
        }
        
        // see if the first col needs to be set to zero as well
        if(isCol){
            for(int i = 0; i < R; i++){
                matrix[i][0] = 0;
            }
        }
    }
}