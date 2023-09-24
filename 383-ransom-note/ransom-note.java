class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        // Create a HashMap to store character frequencies in magazine
        HashMap<Character, Integer> charFreq = new HashMap<>();

        // Count characters in magazine
        for (char c : magazine.toCharArray()) {
            charFreq.put(c, charFreq.getOrDefault(c, 0) + 1);
        }

        // Check if ransomNote can be constructed
        for (char c : ransomNote.toCharArray()) {
            if (charFreq.containsKey(c) && charFreq.get(c) > 0) {
                charFreq.put(c, charFreq.get(c) - 1);
            } else {
                return false; // Character not available in magazine or used up
            }
        }

        return true; // All characters in ransomNote can be constructed
    }
}
