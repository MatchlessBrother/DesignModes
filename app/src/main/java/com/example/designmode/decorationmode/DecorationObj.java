package com.example.designmode.decorationmode;

import android.util.Log;
import com.example.myapplication.ReallyObj;

public class DecorationObj extends AbsDecorationObj
{
    public DecorationObj(com.example.myapplication.AbsReallyObj absReallyObj)
    {
        super(absReallyObj);
    }

    public void eat()
    {
        super.eat();
        super.eat();
    }

    public void sleep()
    {
        super.sleep();
        super.sleep();
    }

    public void swiming()
    {
        Log.i("decorationmode","游泳");

    }
}