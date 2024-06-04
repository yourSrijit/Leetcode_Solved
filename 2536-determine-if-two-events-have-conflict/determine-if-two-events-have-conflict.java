class Solution{
    public boolean haveConflict(String[] event1, String[] event2){
        int st1 = Integer.parseInt(event1[0].substring(0, 2))*60 + Integer.parseInt(event1[0].substring(3));
        int et1 = Integer.parseInt(event1[1].substring(0, 2))*60 + Integer.parseInt(event1[1].substring(3));
        int st2 = Integer.parseInt(event2[0].substring(0, 2))*60 + Integer.parseInt(event2[0].substring(3));
        int et2 = Integer.parseInt(event2[1].substring(0, 2))*60 + Integer.parseInt(event2[1].substring(3));
        return st2<=et1 && st1<=et2;
    }
}