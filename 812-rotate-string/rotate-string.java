class Solution {
    public boolean rotateString(String s, String goal) {
        String sample=s+s;
        if(s.length()!= goal.length()){
            return false;
        }
        if(sample.indexOf(goal)>=0){
            return true;
        }
        return false;
    }
}