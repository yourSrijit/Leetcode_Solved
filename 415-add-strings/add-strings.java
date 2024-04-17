class Solution {
    public String addStrings(String num1, String num2) {
    int i=num1.length()-1;
    int j=num2.length()-1,temp=0;
    StringBuilder ans=new StringBuilder();
    while( i>=0 || j>=0){
        int v1=0,v2=0;
        if(i >=0){
            v1=num1.charAt(i) - '0';
        }
        if(j >=0){
            v2=num2.charAt(j) -'0';
        }
        int sum=v1+v2+temp;
        if(sum >9){
            temp=1;
        }
        else{
            temp=0;
        }
        ans.append(sum%10);
        i--;
        j--;
    }
    if(temp ==1){
        ans.append(temp);
    }
    return ans.reverse().toString();
        
    }
}