package com.example.designmode.iteratormode;

public interface Iterator<T>
{
    T getNextChild();
    boolean hasNextChild();
    void calibrationIndex();
}