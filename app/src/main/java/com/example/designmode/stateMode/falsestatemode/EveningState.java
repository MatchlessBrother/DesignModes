package com.example.designmode.stateMode.falsestatemode;

import android.util.Log;

public class EveningState extends TimeState
{
    public EveningState()
    {
        super(20f);
    }

    public EveningState(float time)
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
            return new AfternoonState(time);
        }
        else if((time > 18 && time <= 24) || (time >= 0 && time < 6))
        {
            mTime = time;
            return this;
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
        Log.i("stateMode","做晚饭,吃晚饭!");
    }

    @Override
    public void startReleaseTime()
    {
        Log.i("stateMode","看一会儿电影就睡觉咯!");
    }
}