class Solution {
    public boolean wordPattern(String pattern, String s) {
        String words[]=s.split(" ");
        if(words.length!=pattern.length()){
            return false;
        }
        int l=pattern.length();
        Map<Character,String>ch =new HashMap<>();
        Map<String,Character>wd =new HashMap<>();
        for(int i=0;i<l;i++){
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