package com.example.designmode.factorymode.abstractfactory;

import com.example.designmode.factorymode.Animal;
import com.example.designmode.factorymode.Person;

public class ShProvinceFactory implements IProvinceFactory
{
    public ShProvinceFactory()
    {

    }

    @Override
    public Person createPerson()
    {
        return new ShPerson();
    }

    @Override
    public Animal createAnimal()
    {
        return new ShAnimal();
    }
}