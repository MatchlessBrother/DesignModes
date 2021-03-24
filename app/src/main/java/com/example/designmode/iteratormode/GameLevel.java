package com.example.designmode.iteratormode;

import java.util.List;
import java.util.LinkedList;

public class GameLevel<T> implements Level<T>
{
    public List<T> mPassLevels;

    public GameLevel()
    {
        mPassLevels = new LinkedList<>();
    }

    @Override
    public Iterator<T> createIterator()
    {
        return new GameIterator(this);
    }

    public void addChild(T value)
    {
        if(!mPassLevels.contains(value))
            mPassLevels.add(value);
    }

    public T removeChild(T value)
    {
        if(mPassLevels.contains(value))
            mPassLevels.remove(value);
        return null;
    }

    public T getChild(int index)
    {
        if(index < mPassLevels.size())
            return mPassLevels.get(index);
        else
            return null;
    }

    public int getChildsSize()
    {
        return mPassLevels.size();
    }
}