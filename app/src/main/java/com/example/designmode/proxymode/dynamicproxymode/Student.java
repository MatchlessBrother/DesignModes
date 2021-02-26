package com.example.designmode.proxymode.dynamicproxymode;

import android.util.Log;

public final class Student implements IGhostWriter
{
    public void action()
    {
        Log.i("proxymode","写作业!");
    }
}