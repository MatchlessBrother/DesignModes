package com.example.designmode.backupmode;

public class BackupSecond
{
    private int mLatestSecond;

    public BackupSecond()
    {

    }

    public int getLatestSecond()
    {
        return mLatestSecond;
    }

    public BackupSecond(int latestSecond)
    {
        mLatestSecond = latestSecond;
    }

    public void setLatestSecond(int latestSecond)
    {
        mLatestSecond = latestSecond;
    }
}