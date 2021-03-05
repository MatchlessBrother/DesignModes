package com.example.designmode.strategymode;

public class PerFullReturnResultPrice implements IResultPrice
{
    private double mPerFullNum;
    private double mPerReturnNum;

    public PerFullReturnResultPrice(double fullNum,double returnNum)
    {
        mPerFullNum = fullNum;
        mPerReturnNum = returnNum;
    }

    @Override
    public double getResultPrice(double price, int num)
    {
        double total = price * num;
        if(total / mPerFullNum > 0)
            return total - (((int)(total / mPerFullNum)) * mPerReturnNum);
        else
            return total;
    }
}