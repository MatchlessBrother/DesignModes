package com.example.designmode.stateMode.falsestatemode;

import android.util.Log;

public class NoonState extends TimeState
{
    public NoonState()
    {
        super(12f);
    }

    public NoonState(float time)
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
            mTime = time;
            return this;
        }
        else if(time >= 13 && time <= 18)
        {
            return new AfternoonState(time);
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
        Log.i("stateMode","做午饭,吃午饭!");
    }

    @Override
    public void startReleaseTime()
    {
        Log.i("stateMode","睡午觉咯!");
    }
}