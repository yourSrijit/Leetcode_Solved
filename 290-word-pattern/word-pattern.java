class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> ch=new HashMap<>();
         HashMap<String,Character> wd=new HashMap<>();
        String words[]=s.split(" +");
        if(pattern.length()!=words.length){
            return false;
        }
        for(int i=0;i<pattern.length();i++){
            char c=pattern.charAt(i);
            String word=words[i];
            if(!ch.containsKey(c)){
                ch.put(c,word);
            }
             if(!wd.containsKey(word)){
                wd.put(word,c);
            }
            if(!ch.get(c).equals(word) || !wd.get(word).equals(c)){
                return false;
            }

        }
        return true;
        
    }
}