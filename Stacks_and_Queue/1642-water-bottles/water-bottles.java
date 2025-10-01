class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans=numBottles;
        int empty= numBottles;
        while(empty>=numExchange){
            int nb= empty/numExchange;
            ans+=nb;
            empty= empty%numExchange +nb;
        }
        return ans;
    }
}