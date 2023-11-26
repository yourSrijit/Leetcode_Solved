class Solution {
    public int findJudge(int n, int[][] trust) {
        int indegree[]=new int[n+1];
        
        for(int i=0;i<trust.length;i++)
        {
            indegree[trust[i][1]]++;
        }
        int judge=-1;
        for(int i=1;i<=n;i++)
        {
            if(indegree[i]==n-1)
            {
                judge=i;
                break;
            }
        }
         for(int i=0;i<trust.length;i++)
        {
            if(trust[i][0]==judge)
                return -1;
        }
        return judge; 
    }
}