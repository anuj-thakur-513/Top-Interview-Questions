class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        // index initialization
        int startingRow = 0;
        int startingCol = 0;
        int endingRow = rows - 1;
        int endingCol = cols - 1;

        int total = rows * cols;
        int count = 0;

        while(count < total){
            // add starting row
            for(int index = startingCol; count < total && index<=endingCol; index++) {
                ans.add(matrix[startingRow][index]);
                count++;
            }
            startingRow++;

            // add ending col
            for(int index = startingRow; count < total && index <= endingRow; index++){
                ans.add(matrix[index][endingCol]);
                count++;
            }
            endingCol--;

            // add ending row
            for(int index = endingCol; count < total && index >= startingCol; index--){
                ans.add(matrix[endingRow][index]);
                count++;
            }
            endingRow--;

            // add starting col
            for(int index = endingRow; count < total && index >= startingRow; index--){
                ans.add(matrix[index][startingCol]);
                count++;
            }
            startingCol++;
        }

        return ans;
    }
}