class Solution {
   public int lengthOfLastWord(String s) {
        if(s==null){
            return 0;
        }
        int n=s.length()-1;
        int count=0;
        for(int i=n;i>=0;i--){
           if(s.charAt(i)!=' '){
               count++;
           }
           else if(count>0){
               break;
           }
        }
    return count;
    }
}