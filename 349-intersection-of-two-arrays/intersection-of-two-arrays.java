class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set=new HashSet();
        HashSet<Integer> iset=new HashSet();
        for(Integer x : nums1){
            set.add(x);
        }
        for(Integer x : nums2){
            if(set.contains(x)){
                iset.add(x);
            }
        }
        int [] res=new int[iset.size()];
        int i=0;
        for(Integer x : iset){
            res[i]=x;
            i++;
        }
        return res;
    }
}