package com.example.designmode.observermode.pushobservermode;

import android.util.Log;

public class Colleague implements IPushObserver
{
    public void receiveNotify(Object obj)
    {
        if(obj instanceof String)
        {
            String bossState = (String)obj;
            if(bossState.contains("老板回来了"))
            {
                Log.i("observermode", "cnm,关键时刻!哎,关机关机!");
            }
        }
    }
}