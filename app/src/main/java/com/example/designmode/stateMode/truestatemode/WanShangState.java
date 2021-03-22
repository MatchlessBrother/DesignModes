package com.example.designmode.stateMode.truestatemode;

import android.util.Log;
import java.nio.file.StandardWatchEventKinds;
import com.example.designmode.stateMode.falsestatemode.NoonState;

public class WanShangState implements TimeSlotState
{
    @Override
    public void cook(float time,WeekendSchedule weekendSchedule)
    {
        if((time > 18 && time <= 24) || (time >= 0 && time < 6))
            Log.i("stateMode","做晚饭,吃晚饭!");
        else
            Log.i("stateMode","异常时间,没法作息!");
    }

    @Override
    public void startReleaseTime(float time,WeekendSchedule weekendSchedule)
    {
        if((time > 18 && time <= 24) || (time >= 0 && time < 6))
            Log.i("stateMode","看一会儿电影就睡觉咯!");
        else
            Log.i("stateMode","异常时间,没法作息!");
    }
}