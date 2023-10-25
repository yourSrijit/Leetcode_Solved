
class Solution {
    public String finalString(String s) {
        char[] arr = s.toCharArray();
        StringBuilder finalStr = new StringBuilder("");
        for (int i = 0; i < s.length(); i++) {
            if (arr[i] != 'i') {
                finalStr.append(arr[i]);
            } else {
                finalStr.reverse();
            }
        }
        return finalStr.toString();
    }
}
