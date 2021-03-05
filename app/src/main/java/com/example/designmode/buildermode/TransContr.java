package com.example.designmode.buildermode;

public class TransContr
{
    private IBikeCreator mBikeCreator;

    public TransContr(IBikeCreator bikeCreator)
    {
        mBikeCreator = bikeCreator;
    }

    public static Bike createBike()
    {
        /**return mBikeCreator.
               iframe().
               rearWheel().
               frontWheel().
               createBike();*/

        return new NewBike.Builder().iframe().frontWheel().rearWheel().createBike();
    }
}