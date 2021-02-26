package com.example.designmode.factorymode.methodfactory;

import android.util.Log;
import com.example.designmode.factorymode.Person;

public class Nurse implements Person
{
    public void action()
    {
        Log.i("factorymode","照顾病人!");
    }
}