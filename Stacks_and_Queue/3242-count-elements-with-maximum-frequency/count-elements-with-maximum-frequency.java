class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer>hm= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!hm.containsKey(nums[i]))hm.put(nums[i],1);
            else{
                hm.put(nums[i],hm.get(nums[i])+1);
            }
        }
        int max=0;
        for(Map.Entry<Integer,Integer>en:hm.entrySet()){
             if(en.getValue()>max)max=en.getValue();
        }

        int count=0;
        for(int i=0;i<nums.length;i++){
            if(hm.get(nums[i])==max)count++;
        }
        return count;
    }
}