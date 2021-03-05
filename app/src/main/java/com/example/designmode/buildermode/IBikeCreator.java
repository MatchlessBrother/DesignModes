package com.example.designmode.buildermode;

public interface IBikeCreator
{
    Bike createBike();
    IBikeCreator iframe();
    IBikeCreator rearWheel();
    IBikeCreator frontWheel();
}