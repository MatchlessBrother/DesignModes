package com.example.designmode.proxymode.staticproxymode;

import android.util.Log;

public class Policy implements IAuxiliaryPolicy
{
    public void action()
    {
        Log.i("proxymode","我给你一拳!");
    }
}