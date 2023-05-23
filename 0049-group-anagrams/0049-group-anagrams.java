class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List> map = new HashMap<>();
        int[] count = new int[26];

        for(String s: strs){
            Arrays.fill(count, 0);
            for(char c: s.toCharArray()){
                count[c - 'a'] += 1;
            }

            String key = "";
            for(int i = 0; i < 26; i++){
                key += '#';
                key += count[i];
            }

            if(!map.containsKey(key)) map.put(key, new ArrayList());
            map.get(key).add(s);
        }

        return new ArrayList(map.values());
    }
}