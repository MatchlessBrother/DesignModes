package com.example.designmode.factorymode.methodfactory;

import android.util.Log;
import com.example.designmode.factorymode.Person;

public class AuxiliaryPolicy implements Person
{
    public void action()
    {
        Log.i("factorymode","打击犯罪活动!");
    }
}