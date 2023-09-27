// class Solution {
//     public boolean lemonadeChange(int[] bills) {
//         int c5=0,c10=0,c20=0;
//         int l=bills.length;
//         for(int i=0;i<l;i++){
//             if(bills[i]==5){
//                 c5++;
//                 // if(i==l-1){
//                 //     return true;
//                 // }
//             }
//             if(bills[i]==10  && c5>0){
//                 c5--;
//                 c10++;
//                 if(i==l-1){
//                     return true;
//                 }
//             }
//             if(bills[i]==20 && c10>0 && c5>0 || bills[i]==20 && c5>2){
//                 if(c10>0){
//                     c10--;
//                     c5--;
//                 }
//                 else{
//                      c5=c5-3;
//                 }
               
//                 if(i==l-1){
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
// }




class Solution {
    public boolean lemonadeChange(int[] bills) {
        int c5 = 0, c10 = 0;
        for (int bill : bills) {
            if (bill == 5) {
                c5++;
            } else if (bill == 10) {
                c10++;
                c5--;
            } else if (c10 > 0) {
                c10--;
                c5--;
            } else {
                c5 -= 3;
            }

            if (c5 < 0) {
                return false; // Not enough change
            }
        }
        return true; // All customers received correct change
    }
}
