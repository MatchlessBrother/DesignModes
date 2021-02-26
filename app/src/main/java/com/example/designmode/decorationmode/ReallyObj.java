package com.example.myapplication;

import android.util.Log;

public class ReallyObj implements com.example.myapplication.AbsReallyObj
{
    public void eat()
    {
        Log.i("decorationmode","吃饭");
    }

    public void sleep()
    {
        Log.i("decorationmode","睡觉");
    }
}