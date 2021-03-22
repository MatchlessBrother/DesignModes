package com.example.designmode.stateMode.falsestatemode;

public class WeekendAction
{
    private TimeState mCurrentTimeState;

    public WeekendAction()
    {
        this.mCurrentTimeState = new MorningState();
    }

    public float getTime()
    {
        return mCurrentTimeState.getTime();
    }

    public void setTime(float time)
    {
        mCurrentTimeState = mCurrentTimeState.setTime(time);
    }

    public void cook()
    {
        mCurrentTimeState.cook();
    }

    public void startReleaseTime()
    {
        mCurrentTimeState.startReleaseTime();
    }
}