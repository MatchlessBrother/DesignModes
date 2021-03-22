package com.example.designmode.stateMode.truestatemode;

import android.util.Log;
import java.nio.file.StandardWatchEventKinds;
import com.example.designmode.stateMode.falsestatemode.NoonState;

public class ZhongWuState implements TimeSlotState
{
    @Override
    public void cook(float time,WeekendSchedule weekendSchedule)
    {
        if(time > 11.5f && time < 13f)
            Log.i("stateMode","做午饭,吃午饭!");
        else
        {
            weekendSchedule.setTimeSlotState(new XiaWuState());
            weekendSchedule.getTimeSlotState().cook(time,weekendSchedule);
        }
    }

    @Override
    public void startReleaseTime(float time,WeekendSchedule weekendSchedule)
    {
        if(time > 11.5f && time < 13f)
            Log.i("stateMode","睡午觉咯!");
        else
        {
            weekendSchedule.setTimeSlotState(new XiaWuState());
            weekendSchedule.getTimeSlotState().startReleaseTime(time,weekendSchedule);
        }
    }
}