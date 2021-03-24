package com.example.designmode.iteratormode;

public class GameIterator<T> implements Iterator<T>
{
    private int mCurrentIndex;
    private GameLevel mGameLevel;

    public GameIterator(GameLevel gameLevel)
    {
        mGameLevel = gameLevel;
    }

    @Override
    public void calibrationIndex()
    {
        mCurrentIndex = 0;
    }

    @Override
    public T getNextChild()
    {
        return (T) mGameLevel.getChild(mCurrentIndex++);
    }

    @Override
    public boolean hasNextChild()
    {
        if(null != mGameLevel.getChild(mCurrentIndex))
            return true;
        else
            return false;
    }
}