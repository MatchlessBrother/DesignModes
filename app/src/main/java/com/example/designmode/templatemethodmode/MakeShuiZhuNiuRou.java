package com.example.designmode.templatemethodmode;

import android.util.Log;

public class MakeShuiZhuNiuRou extends CookDish
{
    @Override
    protected void introduceDish()
    {
        Log.i("templatemethodmode","这道菜叫水煮牛肉!");
    }

    @Override
    protected void makeLaterIngredients()
    {
        Log.i("templatemethodmode","撒点盐,味精,花椒粒,辣椒面!");
    }

    @Override
    protected void makeProphaseIngredients()
    {
        //Log.i("templatemethodmode","!");
    }
}