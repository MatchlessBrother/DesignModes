package com.example.designmode.prototypemode;

import androidx.annotation.NonNull;

/****************浅拷贝******************/
public class Student implements Cloneable
{
    public int age;
    public String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @NonNull
    @Override
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}