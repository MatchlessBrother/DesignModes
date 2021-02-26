package com.example.designmode.observermode.pullobservermode;

import java.util.List;
import android.util.Log;
import java.util.LinkedList;
import com.example.designmode.observermode.pushobservermode.IPushObserver;
import com.example.designmode.observermode.pushobservermode.IPushObservable;

public class Receptionist implements IPullObservable
{
    private Object bossState;
    public List<IPullObserver> observers = new LinkedList<>();

    public Object getLatestInfo()
    {
        return bossState;

    }

    public void notifyObservers()
    {
        for(IPullObserver observer : observers)
        {
            observer.receiveNotify(this);
        }
    }

    public void addObserver(IPullObserver observer)
    {
        if(!observers.contains(observer))
            observers.add(observer);
    }

    public void sendLatestBossState(Object bossState)
    {
        this.bossState = bossState;
        if(bossState instanceof String)
            Log.i("observermode",(String)bossState);
        notifyObservers();
    }

    public void removeObserver(IPullObserver observer)
    {
        if(observers.contains(observer))
            observers.remove(observer);
    }
}