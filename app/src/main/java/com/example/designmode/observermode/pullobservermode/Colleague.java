package com.example.designmode.observermode.pullobservermode;

import android.util.Log;
import com.example.designmode.observermode.pushobservermode.IPushObserver;

public class Colleague implements IPullObserver
{
    public void receiveNotify(IPullObservable observable)
    {
        Object obj = observable.getLatestInfo();
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