class Solution {
    public static boolean checkIsFascinating(String str){
    if(str.length()>9)return false;
    if(str.contains("0")) return false;
    HashSet<Character> set=new HashSet<>();
    for(int i=0;i<str.length();i++){
        if(!set.contains(str.charAt(i))){
            set.add(str.charAt(i));
        }else{
            return false;
        }
    }
    return set.size()==9;
    }
    public boolean isFascinating(int n) {
     String result=Integer.toString(n)+Integer.toString(n*2)+Integer.toString(n*3);
    return checkIsFascinating(result);
    }
}