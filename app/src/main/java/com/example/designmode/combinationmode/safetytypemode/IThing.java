package com.example.designmode.combinationmode.safetytypemode;

interface IThing extends Cloneable
{
    void showThings(int level);
    Object clone() throws CloneNotSupportedException;
}