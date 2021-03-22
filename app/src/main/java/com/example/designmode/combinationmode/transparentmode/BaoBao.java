package com.example.designmode.combinationmode.transparentmode;

import java.util.List;
import android.util.Log;
import java.util.ArrayList;
import androidx.annotation.NonNull;

public class BaoBao implements IThing
{
    private String name;
    private List<IThing> bags;

    public BaoBao()
    {
        bags = new ArrayList<>();
    }

    public String getName()
    {
        return name;
    }

    @Override
    public void setValue(float value)
    {

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

    @Override
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
        BaoBao bao = (BaoBao) super.clone();
        List<IThing> baos = new ArrayList<>();
        for(int index = 0;index < bao.bags.size();index++)
            baos.add((IThing)bao.bags.get(index).clone());
        bao.bags = baos;
        return bao;
    }
}