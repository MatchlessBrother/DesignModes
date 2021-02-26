package com.example.designmode.factorymode.abstractfactory;

import com.example.designmode.factorymode.Animal;
import com.example.designmode.factorymode.Person;

public class ScProvinceFactory implements IProvinceFactory
{
    public ScProvinceFactory()
    {

    }

    @Override
    public Person createPerson()
    {
        return new ScPerson();
    }

    @Override
    public Animal createAnimal()
    {
        return new ScAnimal();
    }
}