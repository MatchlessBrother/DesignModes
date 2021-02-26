package com.example.designmode.proxymode.staticproxymode;

import android.util.Log;

public class AuxiliaryPolicy implements IAuxiliaryPolicy
{
    public Policy mPolicy;

    public AuxiliaryPolicy(Policy policy)
    {
        mPolicy = policy;
    }

    @Override
    public void action()
    {
        Log.i("proxymode","我带上手套!");
        mPolicy.action();
        Log.i("proxymode","我卸下手套!");
    }
}