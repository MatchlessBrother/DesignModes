package com.example.designmode.responsibilitychainmode;

import android.util.Log;

public class GradeTeacher extends Manager
{
    @Override
    public String handle(int leaveDays)
    {
        if(leaveDays <= 7)
        {
            Log.i("responsibilitychainmode", "批准你请假" + leaveDays + "天!");
            return "年级主任";
        }
        else
        {
            if(null != getSuperiorManager())
                return getSuperiorManager().handle(leaveDays);
            return "";
        }
    }
}