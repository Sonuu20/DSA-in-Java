package arrays;

public class BuySellStock {
    public static void MaxProfit(int stock[]) {
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < stock.length; i++) {
            if (stock[i] < buyPrice) {
                buyPrice = stock[i];
            } else if (stock[i] - buyPrice > maxProfit) {
                maxProfit = stock[i] - buyPrice;
            }
        }
        System.out.println("The maximum profit will be: " + maxProfit);
    }

    public static void main(String[] args) {
        int prices[] = { 7, 4, 5, 3, 6, 4 };
        MaxProfit(prices);
    }
}
