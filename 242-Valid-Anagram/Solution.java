class Solution {
    public boolean isAnagram(String s, String t) {
        char[] stringS = s.toCharArray();
        char[] stringT = t.toCharArray();

        Arrays.sort(stringS);
        Arrays.sort(stringT);

        return Arrays.equals(stringS, stringT);
    }
}
