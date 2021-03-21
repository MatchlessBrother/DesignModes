package com.example.designmode.combinationmode.transparentmode;

import android.util.Log;
import androidx.annotation.NonNull;

public class ShangPin implements IThing
{
    private String name;
    private float value;

    public String getName()
    {
        return name;
    }

    public float getValue()
    {
        return value;
    }

    @Override
    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public void setValue(float value)
    {
        this.value = value;
    }

    @Override
    public void addThing(IThing thing)
    {

    }

    @Override
    public void removeThing(IThing thing)
    {

    }

    @Override
    public void showThings(int level)
    {
        StringBuffer stringBuffer = new StringBuffer();
        for(int index = 0;index < level;index++)
            stringBuffer.append("---");
        Log.i("combinationmode",stringBuffer.toString() + "name:" + name + ",value:" + value);
    }

    @NonNull
    @Override
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}