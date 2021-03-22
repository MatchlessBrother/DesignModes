package com.example.designmode.combinationmode.transparentmode;

public interface IThing extends Cloneable
{
    void setName(String name);
    void setValue(float value);
    void showThings(int level);
    void addThing(IThing thing);
    void removeThing(IThing thing);
    Object clone() throws CloneNotSupportedException;
}