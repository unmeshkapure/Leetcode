class Solution 
{
    public int maxProfit(int[] prices) 
    {
        // iBuy ha variable first daycha stock price gheto
        int iBuy = prices[0];

        // iMax ha maximum profit track karnyasathi use karto
        int iMax = 0;

        // loop start kartoy second day pasun (index 1)
        for (int jCnt = 1; jCnt < prices.length; jCnt++) 
        {
            int iSell = prices[jCnt]; // current daycha stock price consider karto (iSell)

            // jara current price iBuy peksha kami asel tar to best buying point asel
            if (iSell < iBuy) 
            {
                iBuy = iSell; // iBuy update karto to cheaper price
            }

            // current price madhun cheapest price subtract karto to get profit
            int iprof = iSell - iBuy;

            // jara ha profit iMax peksha jast asel tar iMax update karto
            if (iprof > iMax)
            {
                iMax = iprof;
            }
        }

        // final madhe jara kahi profit zala asel tar to return karto
        if (iMax > 0) 
        {
            return iMax;
        } 
        else 
        {
            return 0; // nahi tar 0 return karto (loss zala asel tar pan)
        }
    }
}
