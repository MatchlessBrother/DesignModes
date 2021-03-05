package com.example.designmode.responsibilitychainmode;

import android.util.Log;

public class NoHandler extends Manager
{
    @Override
    public String handle(int leaveDays)
    {
        Log.i("responsibilitychainmode", "批个锤子,爬去上学!");
        return "";
    }
}