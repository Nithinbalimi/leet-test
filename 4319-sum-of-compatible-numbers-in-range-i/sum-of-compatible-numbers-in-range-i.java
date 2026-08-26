class Solution {
    public int sumOfGoodIntegers(int n, int k) {
        HashSet <Integer> set=new HashSet();
        int f=0;
        for(int x=1;x<=k+n;x++){
            if(Math.abs(n-x)<=k && (n&x)==0){
                f=1;
                set.add(x);
            }
        }
        int ans=0;
        if(f==0){
            return 0;
        }else {
            for(int x : set){
                ans+=x;
            }
        }return ans;
    }
}