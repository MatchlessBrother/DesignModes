package com.example.designmode.factorymode.abstractfactory;

import android.util.Log;
import com.example.designmode.factorymode.Animal;

public class ScAnimal implements Animal
{
    @Override
    public void action()
    {
        Log.i("factorymode","我是四川动物!");
    }
}