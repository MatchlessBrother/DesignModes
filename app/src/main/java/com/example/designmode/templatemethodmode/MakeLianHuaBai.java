package com.example.designmode.templatemethodmode;

import android.util.Log;

public class MakeLianHuaBai extends CookDish
{
    @Override
    protected void introduceDish()
    {
        Log.i("templatemethodmode","这道菜叫炝炒莲花白!");
    }

    @Override
    protected void makeLaterIngredients()
    {
        Log.i("templatemethodmode","撒点盐!");
    }

    @Override
    protected void makeProphaseIngredients()
    {
        Log.i("templatemethodmode","倒入干辣椒节!");
    }
}