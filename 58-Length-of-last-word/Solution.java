// Remove leading and trailing spaces and then return all words separated by a space
// Return the length of the last word in the array
class Solution {
    public int lengthOfLastWord(String s) {
        String[] words = s.trim().split(" ");
        return words[words.length - 1].length();
    }
}
