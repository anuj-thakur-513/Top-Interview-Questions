class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        int n = words.length;
        int i = 0;

        while (i < n) {
            int j = i + 1;
            int lineLength = words[i].length();

            // Find the last word that can be included in the line
            while (j < n && lineLength + words[j].length() + (j - i - 1) < maxWidth) {
                lineLength += words[j].length();
                j++;
            }

            StringBuilder line = new StringBuilder(words[i]);

            // Calculate the number of extra spaces and words in the line
            int extraSpaces = maxWidth - lineLength;
            int numberOfWords = j - i - 1;

            // If there is more than one word and it's not the last line
            if (numberOfWords > 0 && j != n) {
                int spacesBetweenWords = extraSpaces / numberOfWords;
                int remainingSpaces = extraSpaces % numberOfWords;

                for (int k = i + 1; k < j; k++) {
                    for (int s = 0; s < spacesBetweenWords; s++) {
                        line.append(" ");
                    }
                    if (remainingSpaces > 0) {
                        line.append(" ");
                        remainingSpaces--;
                    }
                    line.append(words[k]);
                }
            } else { // If it's the last line or only one word
                for (int k = i + 1; k < j; k++) {
                    line.append(" ").append(words[k]);
                }
                int remainingSpaces = maxWidth - line.length();
                for (int s = 0; s < remainingSpaces; s++) {
                    line.append(" ");
                }
            }

            result.add(line.toString());
            i = j;
        }

        return result;
    }
}
