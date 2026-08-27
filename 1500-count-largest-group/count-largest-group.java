class Solution {
    public int countLargestGroup(int n) {
       HashMap<Integer,Integer> map=new HashMap();
       int msize=0;
       for(int i=1;i<=n;i++){
            int sum=getDSum(i);
            int csize;
            if(map.containsKey(sum)){
                csize=map.get(sum)+1;
                map.put(sum,csize);
            }
            else{
                csize=1;
                map.put(sum,csize);
            }
            if(csize>msize){
                msize=csize;
            }
        }
        int ans=0;
        for(int x : map.values()){
            if(x==msize){
                ans++;
            }
        }
        return ans;
    }
    public static int getDSum(int num){
        int sum=0;
        while(num>0){
            sum+=num%10;
            num/=10;
        }
        return sum;
    }
}