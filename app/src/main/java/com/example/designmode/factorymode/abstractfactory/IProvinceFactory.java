package com.example.designmode.factorymode.abstractfactory;

import com.example.designmode.factorymode.Animal;
import com.example.designmode.factorymode.Person;

public interface IProvinceFactory
{
    Person createPerson();
    Animal createAnimal();
}