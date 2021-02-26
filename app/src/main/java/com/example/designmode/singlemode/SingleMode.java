package com.example.myapplication;

public class SingleMode
{
    private SingleMode(){}

    /**饿汉式单例模式*/
    private static final SingleMode INSTANCE = new SingleMode();
    public static final SingleMode getInstance()
    {
        return INSTANCE;
    }

    /**Syn懒汉式单例模式*/
    /**private static final SingleMode INSTANCE;
    public synchronized static final SingleMode getInstance()
    {
        if(null == INSTANCE)
            INSTANCE = new SingleMode();
        return INSTANCE;
    }*/

    /**前套类单例模式*/
    /**public static final SingleMode getInstance()
    {
        return SingleModeHolder.INSTANCE;
    }
    private static final class SingleModeHolder
    {
        public static final SingleMode INSTANCE = new SingleMode();
    }*/
}