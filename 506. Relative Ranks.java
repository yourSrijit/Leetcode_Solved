class Solution {
    public String[] findRelativeRanks(int[] score) {
      int n=score.length;
      PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)-> score[b]-score[a]);
      for(int i=0;i<n;i++) 
            pq.add(i);
      String[] ans = new String[n];
      int i=1;
        while(!pq.isEmpty()){
         int idx=pq.poll();
         if(i==1)   { ans[idx]="Gold Medal"; i++;}
         else if(i==2)   { ans[idx]="Silver Medal"; i++;}
         else if(i==3)   { ans[idx]="Bronze Medal"; i++;}
         else ans[idx]=Integer.toString(i++);
        }
        return ans;  
    }
}
