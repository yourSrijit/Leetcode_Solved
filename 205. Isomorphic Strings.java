class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<Character,Character>();
        for(int i=0; i<t.length() ;i++){
        	if(map.containsKey(t.charAt(i))){  
        		if(map.get(t.charAt(i)) == s.charAt(i))  continue;
        		else return false;
        	}else if(map.containsValue(s.charAt(i))){  
        		return false;
        	}
        	else {      
        		map.put(t.charAt(i),s.charAt(i));
        	}
        }
        return true; 
    }
}
