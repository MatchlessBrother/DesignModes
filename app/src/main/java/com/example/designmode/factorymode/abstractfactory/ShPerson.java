package com.example.designmode.factorymode.abstractfactory;

import android.util.Log;
import com.example.designmode.factorymode.Person;

public class ShPerson implements Person
{
    @Override
    public void action()
    {
        Log.i("factorymode","我是上海人!");
    }
}