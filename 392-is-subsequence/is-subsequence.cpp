class Solution {
public:
    bool isSubsequence(string s, string t) {
        int sl=t.size();
        int tl=s.size();
    
        int j=0;
        for(int i=0;i<sl && j<tl;i++){
             if(t[i]==s[j]){
                 j++;
             }
        }
        return (j==tl);
    }
};