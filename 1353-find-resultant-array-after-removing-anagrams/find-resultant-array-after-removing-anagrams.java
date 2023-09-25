class Solution {
    public static boolean isAnagram(String s,String t){
        char[]st1 =s.toCharArray();
        char[]st2 =t.toCharArray();
        Arrays.sort(st1);
        Arrays.sort(st2);
        return Arrays.equals(st1,st2);
    }
    public List<String> removeAnagrams(String[] words) {
        List<String> res=new ArrayList<>();
        int i=0;
        res.add(words[i]);
        for(int j=1;j<words.length;j++){
            if(!isAnagram(words[j],words[j-1])){
               res.add(words[j]);
            }
        }
        return res;
    }
}