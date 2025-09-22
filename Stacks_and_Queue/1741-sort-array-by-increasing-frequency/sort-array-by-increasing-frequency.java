class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer>hm= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!hm.containsKey(nums[i]))hm.put(nums[i],1);
            else hm.put(nums[i],hm.get(nums[i])+1);
        }

        ArrayList<Map.Entry<Integer,Integer>>li= new ArrayList<>(hm.entrySet());
        li.sort((a, b) -> {
    int cmp = a.getValue() - b.getValue(); 
    if (cmp == 0) {
        return b.getKey() - a.getKey(); 
    }
    return cmp;
});

        ArrayList<Integer>arr= new ArrayList<>();
        for(Map.Entry<Integer,Integer>en:li){
            for(int i=0;i<en.getValue();i++){
                arr.add(en.getKey());
            }
        }
      
        for(int i=0;i<arr.size();i++){
            nums[i]=arr.get(i);
        }
        return nums;
    }
}