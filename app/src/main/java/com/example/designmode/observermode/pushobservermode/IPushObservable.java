package com.example.designmode.observermode.pushobservermode;

public interface IPushObservable
{
    /****通知观察者****/
    void notifyObservers(Object obj);

    /****添加观察者****/
    void addObserver(IPushObserver observer);

    /****移除观察者****/
    void removeObserver(IPushObserver observer);
}