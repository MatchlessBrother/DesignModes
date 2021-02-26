package com.example.designmode.factorymode.methodfactory;

import com.example.designmode.factorymode.Person;

public class NurseFactory implements PerrsonFactory
{
    @Override
    public Person createPerson()
    {
        return new Nurse();

    }
}