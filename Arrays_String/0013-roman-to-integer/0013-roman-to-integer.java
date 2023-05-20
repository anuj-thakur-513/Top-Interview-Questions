class Solution {
    public int romanToInt(String s) {
        // create a mapping for the roman numerals
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int sum = 0;
        // here we are subtracting 2 | 20 | 200 because we've once added 1 | 10 | 100 
        // while traversing the string so for actual value we subtract twice
        // for better understanding dry run the code for: MCMXCIV
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            // case for -> IV || IX
            if(ch == 'V' || ch == 'X'){
                if(i != 0 && s.charAt(i-1) == 'I'){
                    sum -= 2;
                }
            }
            // case for XL || XC
            if(ch == 'L' || ch == 'C'){
                if(i != 0 && s.charAt(i-1) == 'X'){
                    sum -= 20;
                }
            }
            // case for CD || CM
            if(ch == 'D' || ch == 'M'){
                if(i != 0 && s.charAt(i-1) == 'C'){
                    sum -= 200;
                }
            }
            // normally adding to the result
            sum += map.get(ch);
        }

        return sum;
    }
}