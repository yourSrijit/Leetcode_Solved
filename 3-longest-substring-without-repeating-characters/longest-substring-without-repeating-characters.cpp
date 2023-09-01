
class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        int n = s.length();
        int maxLength = 0;
        unordered_set<char> set;
        int left = 0;
        
        for (int right = 0; right < n; right++) {
            if (set.count(s[right]) == 0) {
                set.insert(s[right]);
                maxLength = max(maxLength, right - left + 1);
            } else {
                while (set.count(s[right]) > 0) {
                    set.erase(s[left]);
                    left++;
                }
                set.insert(s[right]);
            }
        }
        
        return maxLength;
    }
};
