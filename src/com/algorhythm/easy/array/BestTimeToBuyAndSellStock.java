package com.algorhythm.easy.array;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        if(prices.length < 2) {
            return 0;
        }
        int minPrice=prices[0], maxProfit=0;
        for(int i=1;i<len;i++) {
            maxProfit = Math.max(maxProfit, prices[i]-minPrice);
            minPrice = Math.min(prices[i], minPrice);
        }
        return maxProfit;
    }
}
