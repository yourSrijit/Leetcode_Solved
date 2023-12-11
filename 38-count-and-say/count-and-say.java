class Solution {
    public String countAndSay(int n) {
        if(n==1) return "1";
        if(n==2) return "11";
        String s="11";
        for(int i=3;i<=n;i++){
            s=s+"#";
            String t="";
            int count=1;
            for(int j=1;j<s.length();j++){
                if(s.charAt(j)==s.charAt(j-1)){
                    count++;
                }
                else{
                    t+=count;
                    t=t+s.charAt(j-1);
                    count=1;
                }
            }
            s=t;
        }
        return s;
    }
}