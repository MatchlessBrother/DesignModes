package com.example.designmode.strategymode;

public class DiscountResultPrice implements IResultPrice
{
    private double mDiscount = 1d;

    public DiscountResultPrice(double discount)
    {
        mDiscount = discount;
    }

    @Override
    public double getResultPrice(double price, int num)
    {
        return price * mDiscount * num;
    }
}