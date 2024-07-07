class WaterBottles {
    public int numWaterBottles(int numBottles, int numExchange) {
        int totalDrunk = 0;
        int emptyBottles = 0;

        while(numBottles>0){
            totalDrunk += numBottles;
            emptyBottles += numBottles;
            numBottles = emptyBottles / numExchange;
            emptyBottles = emptyBottles % numExchange;
        }
        return totalDrunk;
    }
