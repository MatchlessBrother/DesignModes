package com.example.designmode.stateMode.truestatemode;

public class WeekendSchedule
{
    private TimeSlotState mTimeSlotState;

    public WeekendSchedule()
    {
        mTimeSlotState = new ShangWuState();
    }

    public TimeSlotState getTimeSlotState()
    {
        return mTimeSlotState;
    }

    public void setTimeSlotState(TimeSlotState timeSlotState)
    {
        mTimeSlotState = timeSlotState;
    }

    public void cook(float time)
    {
        mTimeSlotState.cook(time,this);
    }

    public void startReleaseTime(float time)
    {
        mTimeSlotState.startReleaseTime(time,this);
    }
}