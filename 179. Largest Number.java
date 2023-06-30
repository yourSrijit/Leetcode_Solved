class Solution {
    public String largestNumber(int[] nums) {
        String []str =new String[nums.length];
        for(int i=0;i<nums.length;i++){
            str[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(str,new Comparator<String>(){
            public int compare(String s1,String s2){
                String lr =s1+s2;
                String rl=s2+s1;
                return -lr.compareTo(rl);
            }
        });
        
        StringBuilder sb =new StringBuilder();
        for(String s :str){
            sb.append(s);
        }
        while(sb.charAt(0)=='0' && sb.length()>1){
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }
}
