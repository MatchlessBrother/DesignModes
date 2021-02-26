package com.example.designmode.factorymode.abstractfactory;

import android.util.Log;
import com.example.designmode.factorymode.Animal;

public class ShAnimal implements Animal
{
    @Override
    public void action()
    {
        Log.i("factorymode","我是上海动物!");
    }
}