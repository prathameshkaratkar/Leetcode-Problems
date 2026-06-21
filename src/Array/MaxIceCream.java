package Array;

import java.util.Arrays;

public class MaxIceCream {
    public static void main(String[] args) {
        int[] costs = {1,3,2,4,1};
        int coins = 7;

        int result = maxIceCream(costs, coins);
        System.out.println("The maximum Number Of IceCream Bars: " + result);
    }

    public static int maxIceCream(int[] costs, int coins) {
        int bars = 0;
        int count = 0;

        Arrays.sort(costs);

        for(int i = 0; i < costs.length; i++) {
            if(costs[i] > coins) {
                return count;
            }
            if(bars == coins) {
                return i;
            }
            bars += costs[i];
            count++;

            if(bars > coins) {
                count--;
                return count;
            }
        }


        return count;
    }
}
