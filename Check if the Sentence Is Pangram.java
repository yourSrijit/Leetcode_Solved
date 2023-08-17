class Solution {
    public boolean checkIfPangram(String str) {
        int m=str.length();
        boolean vis[]=new boolean[26];
        if(m<26){
            return false;
        }
        for(int i=0;i<m;i++){
            char s=str.charAt(i);
            if(s>='a'&& s<='z'){
               vis[s-'a']=true;
            }
            // if(s>='A'&& s<='B'){
            //    vis[s-'A']=true;
            // }
        }
        for(int i=0;i<26;i++){
            if(vis[i]==false){
                return false;
            }
        }
        return true;
    }
}
