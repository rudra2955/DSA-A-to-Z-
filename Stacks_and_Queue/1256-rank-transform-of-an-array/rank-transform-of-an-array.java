class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[]a= new int[arr.length];
       
        for(int i=0;i<arr.length;i++){
            a[i]=arr[i];
        }
        Arrays.sort(a);
        HashMap<Integer,Integer>hm= new HashMap<>();
        int rank=1;
        for(int i=0;i<a.length;i++){
            if(!hm.containsKey(a[i]))hm.put(a[i],rank++);
        
        }
        int[]r= new int[arr.length];
        for(int i=0;i<arr.length;i++){
             r[i]=hm.get(arr[i]);
        }
        return r;
    }
}