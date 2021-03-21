package com.example.designmode.stateMode.truestatemode;

import android.util.Log;
import java.nio.file.StandardWatchEventKinds;
import com.example.designmode.stateMode.falsestatemode.NoonState;

public class ShangWuState implements TimeSlotState
{
    @Override
    public void cook(float time,WeekendSchedule weekendSchedule)
    {
        if(time >=6 && time <= 11.5f)
            Log.i("stateMode","做早饭,吃早饭!");
        else
        {
            weekendSchedule.setTimeSlotState(new ZhongWuState());
            weekendSchedule.getTimeSlotState().cook(time,weekendSchedule);
        }
    }

    @Override
    public void startReleaseTime(float time,WeekendSchedule weekendSchedule)
    {
        if(time >=6 && time <= 11.5f)
            Log.i("stateMode","收拾屋子咯!");
        else
        {
            weekendSchedule.setTimeSlotState(new ZhongWuState());
            weekendSchedule.getTimeSlotState().startReleaseTime(time,weekendSchedule);
        }
    }
}