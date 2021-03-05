package com.example.designmode.responsibilitychainmode;

import android.util.Log;

public class ClassTeacher extends Manager
{
    @Override
    public String handle(int leaveDays)
    {
        if(leaveDays <= 2)
        {
            Log.i("responsibilitychainmode", "批准你请假" + leaveDays + "天!");
            return "班主任";
        }
        else
        {
            if(null != getSuperiorManager())
                return getSuperiorManager().handle(leaveDays);
            return "";
        }
    }
}