class Solution {
    public static int square(int n){
        int sqr=0;
        while(n>0){
            int remainder=n%10;
            sqr+=remainder * remainder;
            n/=10;
        }
        return sqr;
    }
    public boolean isHappy(int n) {
        Set<Integer> set=new HashSet<>();

        while(set.add(n)){
            int sqr=square(n);
            if(sqr==1){
                return true;
            }
            n=sqr;
        }
        return false;
    }
}