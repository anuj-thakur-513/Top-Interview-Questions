class Solution {
    public boolean isIsomorphic(String s, String t) {
        // important point -> no two characters can map to the same character
        HashMap<Character, Character> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            // if map already has the key
            if(map.containsKey(s.charAt(i))){
                if(map.get(s.charAt(i)) != t.charAt(i)) return false;
                // else it'll continue to next index
            } else{
                // check if map already contains the value or not
                if(!map.containsValue(t.charAt(i))){
                    map.put(s.charAt(i), t.charAt(i));
                } else{
                    // we can't map two keys to same value, so return false
                    return false;
                }
            }
        }

        return true;
    }
}