package com.example.designmode.factorymode.simplefactory;

import android.util.Log;
import com.example.designmode.factorymode.Person;

public class Policy implements Person
{
    public void action()
    {
        Log.i("factorymode","打击犯罪活动!");
    }
}