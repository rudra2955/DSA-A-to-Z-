class Solution {
    public int maxArea(int[] a) {
        int n = a.length;
        int l = 0;
        int r = n-1;
        int max =0;
        while(l<r){
            int lh=a[l];
            int rh=a[r];
            int mh= Math.min(lh,rh);
            max = Math.max(max, mh*(r-l));
             if (lh<rh){
                l++;
             }
             else r--;
        }
        return max;
    
}}