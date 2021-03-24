package com.example.designmode.backupmode;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class BackupSecondManager
{
    private List<BackupSecond> mBackupSeconds;

    public BackupSecondManager()
    {
        mBackupSeconds = new LinkedList();
    }

    public BackupSecond restoreSecond()
    {
        if(mBackupSeconds.size() > 0)
            return mBackupSeconds.remove(mBackupSeconds.size() - 1);
        return null;
    }

    public void saveSecond(BackupSecond backupSecond)
    {
        if(!mBackupSeconds.contains(backupSecond))
            mBackupSeconds.add(backupSecond);
    }
}