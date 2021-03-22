package com.example.designmode.combinationmode.safetytypemode;

import android.util.Log;
import java.io.Serializable;
import androidx.annotation.NonNull;

public class Goods implements IThing,Serializable
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

    public void setName(String name)
    {
        this.name = name;
    }

    public void setValue(float value)
    {
        this.value = value;
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