package com.example.designmode.combinationmode.safetytypemode;

import java.util.List;
import android.util.Log;
import java.util.ArrayList;
import java.lang.reflect.Array;
import androidx.annotation.NonNull;

public class Bag implements IBag,Cloneable
{
    private String name;
    private List<IThing> bags;

    public Bag()
    {
        bags = new ArrayList<>();
    }

    public String getName()
    {
        return name;
    }

    @Override
    public void addThing(IThing bag)
    {
        if(!bags.contains(bag))
            bags.add(bag);
    }

    @Override
    public void removeThing(IThing bag)
    {
        if(bags.contains(bag))
           bags.remove(bag);
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public void showThings(int level)
    {
        StringBuffer stringBuffer = new StringBuffer();
        for(int index = 0;index < level;index++)
            stringBuffer.append("---");
        Log.i("combinationmode",stringBuffer.toString() + name + "背包:");
        for(int index = 0;index < bags.size();index++)
        {
            bags.get(index).showThings(level + 1);
        }
    }

    @NonNull
    @Override
    public Object clone() throws CloneNotSupportedException
    {
        Bag bag = (Bag) super.clone();
        List<IThing> bags = new ArrayList<>();
        for(int index = 0;index < bag.bags.size();index++)
            bags.add((IThing)bag.bags.get(index).clone());
        bag.bags = bags;
        return bag;
    }
}