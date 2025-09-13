class Solution {
    public int[] twoSum(int[] numbers, int target) {
            int start=0;
        int end=numbers.length-1;
        int[]a=new int[2];
        // ArrayList<Integer>arr=new ArrayList<>();
        while(start<end){
            if(numbers[start]+numbers[end]==target){
                a[0]=start+1;
                a[1]=end+1;
                start++;
                end--;
            }
            else if(numbers[start]+numbers[end]>target){
                end--;
            }
            else start++;
        }
        return a;
    }
}