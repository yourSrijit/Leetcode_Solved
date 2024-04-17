class Solution {
    public int longestPalindrome(String s) {
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }

        int result=0;
        for(Map.Entry<Character,Integer> e:map.entrySet()){
            result += (e.getValue()/2)*2;
            if(result %2 == 0 && e.getValue() %2 !=0){
                result++;
            } 
        }
        return result;
        
    }
}