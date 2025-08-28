class Solution {
    public int[][] sortMatrix(int[][] grid) {
        HashMap<Integer,ArrayList<Integer>>hm= new HashMap<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                int key=i-j;
                if(!hm.containsKey(key)){
                    hm.put(key,new ArrayList<Integer>());
                }
                
                hm.get(key).add(grid[i][j]);
                
            }
        }

        for(int key:hm.keySet()){
            ArrayList<Integer>arr= hm.get(key);

            if(key>=0){
               arr.sort(Collections.reverseOrder());
            }
            else{
                Collections.sort(arr);
            }
        }

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                int key=i-j;
                ArrayList<Integer>list= hm.get(key);
                grid[i][j]=list.remove(0);

            }
        }
        return grid;
    }
}