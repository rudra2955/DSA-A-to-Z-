class Solution {
    void find(int[]a, List<List<Integer>> result, ArrayList<Integer>arr,int i){
        if(i==a.length){
             result.add(new ArrayList<>(arr));
            return;
        }
        find(a,result,arr,i+1);
        arr.add(a[i]);
        find(a,result,arr,i+1);
        arr.remove(arr.size()-1);

    }
    public List<List<Integer>> subsets(int[] nums) {
       List<List<Integer>> result= new ArrayList<>();
        int i=0; 
       ArrayList<Integer> arr= new ArrayList<>();
       find(nums,result,arr,i);
       return result;
    }
}