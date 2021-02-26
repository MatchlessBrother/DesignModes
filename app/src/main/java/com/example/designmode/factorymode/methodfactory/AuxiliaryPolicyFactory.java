package com.example.designmode.factorymode.methodfactory;

import com.example.designmode.factorymode.Person;

public class AuxiliaryPolicyFactory implements PerrsonFactory
{
    @Override
    public Person createPerson()
    {
        return new AuxiliaryPolicy();

    }
}