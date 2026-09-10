package T02_Array;

public class P20_MaxProfit {

    // At most 1 transaction --> can buy only once and sell only once
    public static int maxProfit_I(int[] prices) {
        int maxProfit = 0;
        int minPrice = prices[0];

        for (int price : prices) {
            minPrice = Math.min(minPrice, price);
            maxProfit = Math.max(maxProfit, price - minPrice);
        }
        return maxProfit;
    }

    // can buy and sell multiple times but have to sell before buy again
    public static int maxProfit_II(int[] prices) {
        if (prices.length == 1) return 0;

        int maxProfit = 0;

        for (int i=1; i<prices.length; i++) {
            int diff = prices[i] - prices[i-1];
            if (diff > 0) maxProfit += diff;
        }
        return maxProfit;
    }

    // At most two transactions --> can buy and sell at most two times, but have to sell before buy again
    public static int maxProfit_III(int[] prices) {
        int buy1 = Integer.MAX_VALUE, sell1 = 0;
        int buy2 = Integer.MAX_VALUE, sell2 = 0;

        for (int price : prices) {
            buy1 = Math.min(buy1, price);
            sell1 = Math.max(sell1, price - buy1);
            buy2 = Math.min(buy2, price-sell1);
            sell2 = Math.max(sell2, price-buy2);
        }
        return sell2;
    }

    static void main() {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.print(maxProfit_I(prices));
        System.out.print(maxProfit_II(prices));

        int[] prices2 = {3, 3, 5, 0, 0, 3, 1, 4};
        System.out.print(maxProfit_III(prices2));
    }
}
