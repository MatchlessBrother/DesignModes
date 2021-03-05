package com.example.designmode.buildermode;

import android.util.Log;

public class BikeCreatorB implements IBikeCreator
{
    private Bike mBike = new Bike();
    private final String Name = "李四";

    @Override
    public IBikeCreator iframe()
    {
        mBike.setmIframe(Name + "构建车框架完成!");
        Log.i("buildermode",Name + "构建车框架完成!");
        return this;
    }

    @Override
    public IBikeCreator rearWheel()
    {
        mBike.setmIframe(Name + "构建车后轮完成!");
        Log.i("buildermode",Name + "构建车后轮完成!");
        return this;
    }

    @Override
    public IBikeCreator frontWheel()
    {
        mBike.setmIframe(Name + "构建车前轮完成!");
        Log.i("buildermode",Name + "构建车前轮完成!");
        return this;
    }

    @Override
    public Bike createBike()
    {
        return mBike;
    }
}