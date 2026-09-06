class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int f=cost[0];
        int s=cost[1];
        for(int i=2;i<cost.length;i++){
            int c=Math.min(f,s)+cost[i];
            f=s;
            s=c;
        }
        return Math.min(s,f);
    }
}