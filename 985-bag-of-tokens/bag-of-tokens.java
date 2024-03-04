class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int l=tokens.length;
        int i=0,j=l-1;
        int maxScore=0;
        int score=0;
        while(i<=j){
            if(power>=tokens[i]){
                power-=tokens[i];
                score++;
                i++;
                maxScore=Math.max(maxScore,score);
            }
            else if(score>=1){
                score--;
                power+=tokens[j];
                j--;
            }
            else{
                return maxScore;
            }
        }
        return maxScore;
        
    }
}