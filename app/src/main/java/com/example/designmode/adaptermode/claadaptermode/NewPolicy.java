package com.example.designmode.adaptermode.claadaptermode;

import android.util.Log;

public class NewPolicy extends Policy implements INewPolicy
{
    @Override
    public void combatingCrime()
    {
        Log.i("adaptermode", "警察开始打击违法犯罪了！");
    }
}