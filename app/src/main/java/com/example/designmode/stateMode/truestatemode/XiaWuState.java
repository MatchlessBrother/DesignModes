package com.example.designmode.stateMode.truestatemode;

import android.util.Log;
import java.nio.file.StandardWatchEventKinds;
import com.example.designmode.stateMode.falsestatemode.NoonState;

public class XiaWuState implements TimeSlotState
{
    @Override
    public void cook(float time,WeekendSchedule weekendSchedule)
    {
        if(time >= 13f && time <= 18f)
            Log.i("stateMode","做下午茶,喝下午茶!");
        else
        {
            weekendSchedule.setTimeSlotState(new WanShangState());
            weekendSchedule.getTimeSlotState().cook(time,weekendSchedule);
        }
    }

    @Override
    public void startReleaseTime(float time,WeekendSchedule weekendSchedule)
    {
        if(time >= 13f && time <= 18f)
            Log.i("stateMode","玩游戏咯!");
        else
        {
            weekendSchedule.setTimeSlotState(new WanShangState());
            weekendSchedule.getTimeSlotState().startReleaseTime(time,weekendSchedule);
        }
    }
}