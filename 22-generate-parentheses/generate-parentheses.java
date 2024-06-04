class Solution {
    private static void backtrack(List<String> ans,int n,int open,int close,String cur){
     if(cur.length()==n*2){
        ans.add(cur);
     }
     if(open<n){
        backtrack(ans,n,open+1,close,cur+"(");
     }
     if(close <open){
        backtrack(ans,n,open,close+1,cur+")");
     }

    }
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        backtrack(ans,n,0,0,"");
        return ans;        
    }
}