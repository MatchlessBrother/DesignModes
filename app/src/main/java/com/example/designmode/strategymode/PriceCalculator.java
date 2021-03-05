package com.example.designmode.strategymode;

import android.util.Log;

public class PriceCalculator
{
    private IResultPrice mResultPrice;
    public static final int NormalType = 0x0001;
    public static final int DiscountType = 0x0002;
    public static final int FullReturnType = 0x0003;
    public static final int PerFullReturnType = 0x0004;

    public PriceCalculator(int type)
    {
        switch(type)
        {
            case DiscountType:
            {
                mResultPrice = new DiscountResultPrice(0.6d);
                Log.i("strategymode","活动:打六折!");
                break;
            }
            case FullReturnType:
            {
                mResultPrice = new FullReturnResultPrice(200d,80d);
                Log.i("strategymode","活动:满200减80!");
                break;
            }
            case PerFullReturnType:
            {
                mResultPrice = new PerFullReturnResultPrice(100d,60d);
                Log.i("strategymode","活动:每满100减60!");
                break;
            }
            default:
            {
                Log.i("strategymode","活动:没有!");
                mResultPrice = new NormalResultPrice();
                break;
            }
        }
    }

    public double getResultPrice(double price,int num)
    {
        double resultPrice = mResultPrice.getResultPrice(price,num);
        Log.i("strategymode","最终价格:" + resultPrice);
        Log.i("strategymode","**********************");
        return resultPrice;
    }
}