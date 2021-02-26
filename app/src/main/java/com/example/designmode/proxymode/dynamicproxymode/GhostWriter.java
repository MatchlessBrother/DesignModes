package com.example.designmode.proxymode.dynamicproxymode;

import android.util.Log;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationHandler;

public class GhostWriter implements InvocationHandler
{
    public Object mObj;

    public GhostWriter(Object obj)
    {
        mObj = obj;
    }

    @Override
    public Object invoke(Object o,Method method,Object[] objects) throws Throwable
    {
        Log.i("proxymode","从内裤中拿出一米的毛笔!");
        method.setAccessible(true);
        Object result = method.invoke(mObj,objects);
        Log.i("proxymode","写完作业,巧妙的把毛笔收入内裤!");
        return result;
    }
}