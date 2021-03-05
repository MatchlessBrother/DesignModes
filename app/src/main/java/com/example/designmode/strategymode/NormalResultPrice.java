package com.example.designmode.strategymode;

public class NormalResultPrice implements IResultPrice
{
    public NormalResultPrice()
    {

    }

    @Override
    public double getResultPrice(double price, int num)
    {
        return price * num;
    }
}