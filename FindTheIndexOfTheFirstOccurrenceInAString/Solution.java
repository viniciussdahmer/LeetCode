class Solution {
    public int strStr(String haystack, String needle) {
        int needleLength = needle.length();

        // impossible to be a match since needle is larger than haystack
        if (needleLength > haystack.length()) {
            return -1;
        }

        if (needle.equals(haystack)) {
            return 0;
        }

        for (int i = 0; i <= haystack.length() - needleLength; i++) {
            String subString = haystack.substring(i, i + needleLength);

            if (subString.equals(needle)) {
                return i;
            }
        }

        return -1;
    }
}
