package com.example.designmode.proxymode.cglibproxymode;

import android.util.Log;
import android.content.Context;
import java.lang.reflect.Method;
import leo.android.cglib.proxy.Enhancer;
import leo.android.cglib.proxy.MethodProxy;
import leo.android.cglib.proxy.MethodInterceptor;

public class PurchasingAgent implements MethodInterceptor
{
    public Object mObj;

    public Object getProxyInstance(Context context,Object obj)
    {
        mObj = obj;
        Enhancer enhancer = new Enhancer(context);
        enhancer.setSuperclass(mObj.getClass());
        enhancer.setInterceptor(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Object[] objects, MethodProxy methodProxy) throws Exception
    {
        Log.i("proxymode","找到代购人员!");
        Object result = methodProxy.invokeSuper(o,objects);
        Log.i("proxymode","结束代购!");
        return result;
    }
}