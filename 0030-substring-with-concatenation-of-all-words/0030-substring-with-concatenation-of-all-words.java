class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();

        // Check for base cases
        if (s == null || s.length() == 0 || words == null || words.length == 0) {
            return result;
        }

        int wordLength = words[0].length();
        int wordsCount = words.length;
        int totalLength = wordLength * wordsCount;

        // Create a map to store the count of each word in the words array
        Map<String, Integer> wordCountMap = new HashMap<>();
        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        // Iterate through the possible starting indices
        for (int i = 0; i < wordLength; i++) {
            int left = i; // Left pointer of the sliding window
            int count = 0; // Count of valid words in the current substring
            Map<String, Integer> currWordCountMap = new HashMap<>();

            // Move the right pointer of the sliding window
            for (int right = i; right <= s.length() - wordLength; right += wordLength) {
                String word = s.substring(right, right + wordLength);

                // Add the current word to the map
                currWordCountMap.put(word, currWordCountMap.getOrDefault(word, 0) + 1);
                count++;

                // Shrink the sliding window if the current word count exceeds the expected count
                while (currWordCountMap.getOrDefault(word, 0) > wordCountMap.getOrDefault(word, 0)) {
                    String leftWord = s.substring(left, left + wordLength);
                    currWordCountMap.put(leftWord, currWordCountMap.get(leftWord) - 1);
                    count--;
                    left += wordLength;
                }

                // Check if a valid concatenated substring is found
                if (count == wordsCount) {
                    result.add(left);
                }
            }
        }

        return result;
    }
}