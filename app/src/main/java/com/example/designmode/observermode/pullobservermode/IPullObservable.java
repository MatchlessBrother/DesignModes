package com.example.designmode.observermode.pullobservermode;

import com.example.designmode.observermode.pushobservermode.IPushObserver;

public interface IPullObservable
{
    /*******获取最新的变更数据*******/
    Object getLatestInfo();

    /******通知观察者数据有变更******/
    void notifyObservers();

    /***********添加观察者**********/
    void addObserver(IPullObserver observer);

    /***********移除观察者**********/
    void removeObserver(IPullObserver observer);
}
