package com.example.designmode.stateMode.truestatemode;

interface TimeSlotState
{
    void cook(float time,WeekendSchedule weekendSchedule);
    void startReleaseTime(float time,WeekendSchedule weekendSchedule);
}