package com.example.designmode.backupmode;

import android.util.Log;

public class Second
{
    private int mLatestSecond;

    public int getLatestSecond()
    {
        return mLatestSecond;
    }

    public void setLatestSecond(int latestSecond)
    {
        mLatestSecond = latestSecond;
    }

    public BackupSecond createBackupSecond()
    {
        Log.i("backupmode","已为第" + mLatestSecond + "关保存游戏数据!");
        return new BackupSecond(mLatestSecond);
    }

    public void restoreBackupSecond(BackupSecond backupSecond)
    {
        Log.i("backupmode","恢复游戏关数到第" + backupSecond.getLatestSecond() + "关!");
        mLatestSecond = backupSecond.getLatestSecond();
    }
}