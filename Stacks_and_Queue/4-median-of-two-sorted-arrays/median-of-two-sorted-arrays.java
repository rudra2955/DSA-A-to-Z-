class Solution {

    int[] merge(int[]nums1, int[]nums2){
        int n=nums1.length;
        int m= nums2.length;
        int[]a= new int[n+m];
        int k=0;
        int i=0;
        int j=0;
        while(i<n && j<m){
            if(nums1[i]<=nums2[j]){
             a[k++]=nums1[i++];
            }
            else{
                a[k++]=nums2[j++];
            }
        }
        while(i<n)a[k++]=nums1[i++];
        while(j<m)a[k++]=nums2[j++];
        
        return a;
    }
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[]merged= merge(nums1,nums2);
        int n=nums1.length;
        int m= nums2.length;
        int mid= (merged.length/2);
        if((n+m)%2==0) return ((merged[mid]+merged[mid-1])/2.0);
        else return merged[(mid)];

    }
}