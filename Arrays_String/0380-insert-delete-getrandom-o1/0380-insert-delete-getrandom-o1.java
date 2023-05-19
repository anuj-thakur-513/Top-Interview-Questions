class RandomizedSet {
    // this will store the entered nums
    private List<Integer> nums;
    // this will be a map for value to index
    private HashMap<Integer, Integer> map;
    // to return random value
    private Random random;

    public RandomizedSet() {
        nums = new ArrayList<>();
        map = new HashMap<>();
        random = new Random();
    }
    
    public boolean insert(int val) {
        if(map.containsKey(val)) {
            return false;
        }

        map.put(val, nums.size());
        nums.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if(!map.containsKey(val)) {
            return false;
        }

        // swap last entered value with removed value
        int index = map.get(val);
        int lastNum = nums.get(nums.size() - 1);
        nums.set(index, lastNum);
        // update the new index
        map.put(lastNum, index);
        // remove the val
        map.remove(val);
        nums.remove(nums.size() - 1);

        return true;
    }
    
    public int getRandom() {
        int randIndex = random.nextInt(nums.size());
        return nums.get(randIndex);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */