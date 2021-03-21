package com.example.designmode.stateMode.falsestatemode;

import android.util.Log;

public class AfternoonState extends TimeState
{
    public AfternoonState()
    {
        super(13f);
    }

    public AfternoonState(float time)
    {
        super(time);
    }

    @Override
    public TimeState setTime(float time)
    {
        if(time >= 6 && time <= 11.5f)
        {
            return new MorningState(time);
        }
        else if(time > 11.5 && time < 13f)
        {
            return new NoonState(time);
        }
        else if(time >= 13 && time <= 18)
        {
            mTime = time;
            return this;
        }
        else if((time > 18 && time <= 24) || (time >= 0 && time < 6))
        {
            return new EveningState(time);
        }
        else
        {
            time = time % 24;
            return setTime(time);
        }
    }

    @Override
    public void cook()
    {
        Log.i("stateMode","做下午茶,喝下午茶!");
    }

    @Override
    public void startReleaseTime()
    {
        Log.i("stateMode","玩游戏咯!");
    }
}