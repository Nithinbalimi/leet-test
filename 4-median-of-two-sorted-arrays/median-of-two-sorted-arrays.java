class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] n=new int[nums1.length+nums2.length];
        int i=0,j=0,k=0;
        int l=n.length;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                n[k]=nums1[i];
                i++;
                k++;
            }
            else if(nums1[i]>nums2[j]){
                n[k]=nums2[j];
                j++;
                k++;
            }
            else{
                n[k]=nums1[i];
                k++;
                i++;
                n[k]=nums2[j];
                k++;
                j++;
            }
        }
        while(i<nums1.length){
            n[k]=nums1[i];
            k++;
            i++;
        }
        while(j<nums2.length){
            n[k]=nums2[j];
            k++;
            j++;
        }
        double ans=0;
        if(l%2==0){
            ans=(n[l/2]+n[(l/2)-1])/2.0;
        }else{
            ans=(n[l/2]);
        }
        return ans;
    }
}