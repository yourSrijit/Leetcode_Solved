class Solution {
    public static boolean isAlpha(char s) {
        if ((s >= 'a' && s <= 'z') || (s >= 'A' && s <= 'Z')) {
            return true;
        }
        return false;
    }

    public String reverseOnlyLetters(String s) {
        char[] chars = s.toCharArray();
        int l = 0;
        int h = s.length() - 1;

        while (l < h) {
            if (isAlpha(chars[l]) && isAlpha(chars[h])) {
                char temp = chars[l];
                chars[l] = chars[h];
                chars[h] = temp;
                l++;
                h--;
            } else if (!isAlpha(chars[l])) {
                l++;
            } else if (!isAlpha(chars[h])) {
                h--;
            }
        }

        return new String(chars);
    }
}
