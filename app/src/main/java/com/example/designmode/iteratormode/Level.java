package com.example.designmode.iteratormode;

public interface Level<T>
{
    Iterator<T> createIterator();
}