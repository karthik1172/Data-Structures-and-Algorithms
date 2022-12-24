public class BestTimeToBuySellStocksWithCoolDown {
    class Solution {
        public int maxProfit(int[] arr) {
            int buy = -arr[0];
            int sell = 0;
            int col = 0;

            for(int i=1; i<arr.length; i++) {
                int nBuy = Math.max(buy, col - arr[i]);
                int nSell = Math.max(sell, arr[i] + buy);
                int newCold = Math.max(col, sell);

                buy = nBuy;
                sell = nSell;
                col = newCold;
            }
            return sell;
        }
    }
}
