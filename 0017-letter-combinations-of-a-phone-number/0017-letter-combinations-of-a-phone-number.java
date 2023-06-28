class Solution {
    // mapping for every number
    private String[] mapping = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    public List<String> letterCombinations(String digits) {        
        List<String> ans = new ArrayList<>();
        
        // edge case
        if(digits.length() == 0 || digits == null) return ans;
        
        letterCombinations(digits, "", ans, 0);
        return ans;
    }
    
    private void letterCombinations(String digits, String output, List<String> ans, int index){
        // base case
        if(index == digits.length()){
            ans.add(output);
            return;
        }
        
        // getting the number from string
        int num = digits.charAt(index) - '0';
        String value = mapping[num];
        
        // taking every character from a digit and then passing it to the recursive function
        // then the function moves to next digit, because we pass index + 1
        for(int i = 0; i < value.length(); i++){
            output = output + value.charAt(i);
            letterCombinations(digits, output, ans, index + 1);
            output = output.substring(0, output.length() - 1);
        }
    }
}