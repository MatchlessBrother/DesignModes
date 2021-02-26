package com.example.designmode.observermode.pushobservermode;

import java.util.List;
import android.util.Log;
import java.util.LinkedList;

public class Receptionist implements IPushObservable
{
    public List<IPushObserver> observers = new LinkedList<>();

    public void sendLatestBossState(Object bossState)
    {
        if(bossState instanceof String)
            Log.i("observermode",(String)bossState);
        notifyObservers(bossState);
    }

    public void notifyObservers(Object obj)
    {
        for(IPushObserver observer : observers)
        {
            observer.receiveNotify(obj);
        }
    }

    public void addObserver(IPushObserver observer)
    {
        if(!observers.contains(observer))
            observers.add(observer);
    }

    public void removeObserver(IPushObserver observer)
    {
        if(observers.contains(observer))
            observers.remove(observer);
    }
}