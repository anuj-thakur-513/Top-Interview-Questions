class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] candies = new int[n];
        // initially every child will have at least 1 candy
        Arrays.fill(candies, 1);
        // checking from the left side if the current rating is 
        // greater than the previous rating
        for(int i = 1; i < n; i++) {
            if(ratings[i] > ratings[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            }
        }
        
        int sum = candies[n - 1];
        // checking from right side if the current rating is greater than 
        // next rating and then increase the candies if there's a need to
        for(int i = ratings.length - 2; i >= 0; i--) {
            if(ratings[i] > ratings[i + 1]) {
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            }

            sum += candies[i];
        }

        return sum;
    }
}