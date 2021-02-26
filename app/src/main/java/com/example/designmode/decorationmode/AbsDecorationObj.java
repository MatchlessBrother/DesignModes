package com.example.designmode.decorationmode;

import com.example.myapplication.ReallyObj;

public class AbsDecorationObj implements com.example.myapplication.AbsReallyObj
{
    private com.example.myapplication.AbsReallyObj mAbsReallyObj;

    public AbsDecorationObj(com.example.myapplication.AbsReallyObj mAbsReallyObj)
    {
        this.mAbsReallyObj = mAbsReallyObj;
    }

    public void sleep()
    {
        mAbsReallyObj.sleep();

    }

    public void eat()
    {
        mAbsReallyObj.eat();

    }
}