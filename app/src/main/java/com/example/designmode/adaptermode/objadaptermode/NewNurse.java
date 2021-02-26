package com.example.designmode.adaptermode.objadaptermode;

import android.util.Log;
import com.example.designmode.adaptermode.claadaptermode.INewPolicy;

public class NewNurse implements INewNurse
{
    public Nurse mNurse;

    public NewNurse(Nurse nurse)
    {
        mNurse = nurse;
    }

    @Override
    public void feedingMedicine()
    {
        Log.i("adaptermode","护士开始给病人喂药了!");
    }

    @Override
    public void action()
    {
        mNurse.action();
    }
}