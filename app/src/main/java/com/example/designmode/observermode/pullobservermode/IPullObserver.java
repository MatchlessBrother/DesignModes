package com.example.designmode.observermode.pullobservermode;

import com.example.designmode.observermode.pushobservermode.IPushObservable;

public interface IPullObserver
{
    void receiveNotify(IPullObservable observable);
}