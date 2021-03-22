package com.example.designmode.stateMode.falsestatemode;

public abstract class TimeState
{
    protected float mTime;

    public TimeState(float time)
    {
        mTime = time;
    }

    public float getTime()
    {
        return mTime;
    }

    public abstract void cook();
    public abstract void startReleaseTime();
    public abstract TimeState setTime(float time);
}