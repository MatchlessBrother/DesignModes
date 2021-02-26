package com.example.designmode.factorymode.abstractfactory;

import android.util.Log;
import com.example.designmode.factorymode.Person;

public class ScPerson implements Person
{
    @Override
    public void action()
    {
        Log.i("factorymode","我是四川人!");
    }
}