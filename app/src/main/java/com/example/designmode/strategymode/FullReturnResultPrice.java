package com.example.designmode.strategymode;

public class FullReturnResultPrice implements IResultPrice
{
    private double mFullNum;
    private double mReturnNum;

    public FullReturnResultPrice(double fullNum,double returnNum)
    {
        mFullNum = fullNum;
        mReturnNum = returnNum;
    }

    @Override
    public double getResultPrice(double price, int num)
    {
        double total = price * num;
        if(total > mFullNum && total - mFullNum >= 0)
            return total - mFullNum;
        else
            return total;
    }
}