class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sum_gas = 0, sum_cost = 0;

        // get sum of gas and costs
        for(int i=0; i<gas.length; i++){
            sum_gas += gas[i];
            sum_cost += cost[i];
        }
        // if cost sum is greater then, we can't travel
        if(sum_gas < sum_cost) return -1;

        int total = 0;
        int start_index = 0;

        for(int i=0; i<gas.length; i++){
            // keep checking for total and start the iteration when we get
            // greater than 0
            total += gas[i]-cost[i];
            // if we get total<0, then reset total and start from next index
            if(total < 0){
                total = 0;
                start_index = i+1;
            }
        }

        return start_index;
    }
}