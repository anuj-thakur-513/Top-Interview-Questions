class Solution {
    private HashMap<Integer, String> map;
    Solution() {
        map = new HashMap<>();
        map.put(1, "I");
        map.put(4, "IV");
        map.put(5, "V");
        map.put(9, "IX");
        map.put(10, "X");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(1000, "M");
        map.put(900, "CM");

    }

    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        int multiple = 1; // keep track of current place in the number i.e. ones place, tens place ... 

        while(num != 0) {
            int ones = num % 10;
            // this is the part where we are using our multiple to get the actual number
            int multipleWithOnes = ones * multiple;
            num /= 10;
            if(ones > 1 && ones < 4) { // 2, 3
                for(int i = 0; i < ones; i++) {
                    sb.insert(0, map.get(1 * multiple));
                }
            } else if(ones > 5 && ones < 9) { // 6, 7, 8
                for(int i = 0; i < ones - 5; i++) {
                    sb.insert(0, map.get(1 * multiple));
                }
                sb.insert(0, map.get(5 * multiple));
            } else if(ones == 0) { // 0
                multiple *= 10;
                continue;
            } else { // 1, 4, 5, 9
                sb.insert(0, map.get(multipleWithOnes));
            }

            multiple *= 10;
        }

        return sb.toString();
    }
}