class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int sum=numBottles;
        while(numBottles>=numExchange){
            int a=numBottles/numExchange;
            sum=sum+a;
            numBottles=a+(numBottles%numExchange);
        }
        return sum;
    }
}