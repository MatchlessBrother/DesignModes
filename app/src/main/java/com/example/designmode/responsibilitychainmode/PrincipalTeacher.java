package com.example.designmode.responsibilitychainmode;

import android.util.Log;

public class PrincipalTeacher extends Manager
{
    @Override
    public String handle(int leaveDays)
    {
        if(leaveDays <= 10)
        {
            Log.i("responsibilitychainmode", "批准你请假" + leaveDays + "天!");
            return "校长";
        }
        else
        {
            if(null != getSuperiorManager())
                return getSuperiorManager().handle(leaveDays);
            return "";
        }
    }
}