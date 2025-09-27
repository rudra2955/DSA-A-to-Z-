class Solution {
    boolean isvalid(int a, int b, int c){
        if(a+b>c && b+c>a && a+c>b)return true;
        return false;
    }
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int p=0;
        for(int i=0;i<nums.length-2;i++){
           
                 if(isvalid(nums[i],nums[i+1],nums[i+2])){
                    int ans= nums[i]+nums[i+1]+nums[i+2];
                    p=Math.max(p,ans);
                 
            }
        }
        return p;
    }
}