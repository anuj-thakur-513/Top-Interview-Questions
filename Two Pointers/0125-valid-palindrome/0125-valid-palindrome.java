class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        s = s.toLowerCase();
        // build final string without any white spaces
        for(int i = 0; i < s.length(); i++){
            if(isValid(s.charAt(i))){
                sb.append(s.charAt(i));
            }
        }

        String finalString = sb.toString();

        int i = 0, j = finalString.length() - 1;

        while(i <= j){
            char ch1 = finalString.charAt(i);
            char ch2 = finalString.charAt(j);

            if(ch1 != ch2){
                return false;
            }
            i++;
            j--;
        }
        
        return true;
    }

    private boolean isValid(char ch){
        if((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')){
            return true;
        }
        return false;
    }
}