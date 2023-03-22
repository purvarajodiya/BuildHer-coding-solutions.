/* Easy 1
Given a string s consisting of words and spaces, return the length of the last word in the string.
A word is a maximal 
substring consisting of non-space characters only.
*/

class Solution {
    public int lengthLastWord(String s) {
        int wordLength = 0;
        if (s.length() == 1){
            return 1;
        }
        for (int i = s.length() - 1; i >= 0; i--){
            if (s.charAt(i) != ' '){
                wordLength++;
            }else if (wordLength != 0 && s.charAt(i) == ' '){
                return wordLength;
            }
            
        }
        return wordLength;
    }
}