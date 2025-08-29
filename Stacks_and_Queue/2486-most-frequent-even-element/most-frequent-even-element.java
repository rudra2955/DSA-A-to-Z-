class Solution {
    public int mostFrequentEven(int[] nums) {
        
        HashMap<Integer,Integer>hm= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                if(hm.containsKey(nums[i])){
                hm.put(nums[i], hm.get(nums[i])+1);
            }
            else hm.put(nums[i],1);
            }

        }

        if(hm.isEmpty())return -1;
         
        
        int maxFreq = Integer.MIN_VALUE;
        ArrayList<Integer> arr = new ArrayList<>(hm.keySet());
        
        for(int i : arr){
            if(hm.get(i) > maxFreq){
                maxFreq = hm.get(i);
            }
        }
        
        arr.clear();
       
        for (int c : hm.keySet()) {
            if (hm.get(c) == maxFreq) {
                arr.add(c);
            }
        }
        
        return Collections.min(arr);
    }
}