class Solution {
    public boolean wordPattern(String pattern, String s) {
        // store the words in string into a string array
        String[] words = s.split(" ");
        
        // if the characters are not equal to the number of words in the string then return false
        if(pattern.length() != words.length) return false;
        
        // create a hashmap for storing the data
        HashMap<Character, String> map = new HashMap<>();
        
        for(int i = 0; i < pattern.length(); i++){
            // store the current char of the pattern
            char currentCharacter = pattern.charAt(i);
            
            // check if the map already has key of current character
            if(map.containsKey(currentCharacter)){
                // if the value mapped to key is not equal to the current word then false
                if(!map.get(currentCharacter).equals(words[i]))
                    return false;
            } else {
                // if map has already the value of current word mapped to any other key then return false
                if(map.containsValue(words[i]))
                    return false;
                // put the key value pair in the map
                map.put(currentCharacter, words[i]);
            }
            
        }
        
        return true;
    }
}