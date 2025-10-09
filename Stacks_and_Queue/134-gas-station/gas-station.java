class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalgas=0;
        int totalcost=0;
        int start=0;
        int current=0;
        for(int i=0;i<gas.length;i++){
            totalgas+=gas[i];
            totalcost+=cost[i];
            current+=gas[i]-cost[i];
            if(current<0){
                start=i+1;
                current=0;
            }


        }
        if(totalcost>totalgas)return -1;
        return start;
    }
}