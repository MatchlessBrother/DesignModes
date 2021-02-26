package com.example.designmode.factorymode.simplefactory;

import com.example.designmode.factorymode.Person;

public class PersonFactory
{
    public static final String POLICY = "policy";
    public static final String DOCTOR = "doctor";
    public static Person createPerson(String type)
    {
        switch(type)
        {
            case POLICY:
            {
                return new Policy();
            }
            case DOCTOR:
            {
                return new Doctor();
            }
        }
        return null;
    }
}