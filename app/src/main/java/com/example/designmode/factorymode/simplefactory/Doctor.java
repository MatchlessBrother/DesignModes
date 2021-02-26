package com.example.designmode.factorymode.simplefactory;

import android.util.Log;
import com.example.designmode.factorymode.Person;

public class Doctor implements Person
{
    public void action()
    {
        Log.i("factorymode","救治病人!");
    }
}