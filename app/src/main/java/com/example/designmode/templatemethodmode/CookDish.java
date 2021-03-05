package com.example.designmode.templatemethodmode;

import android.util.Log;

public abstract class CookDish
{
    public final void cookADish()
    {
        introduceDish();
        Log.i("templatemethodmode","买菜!");
        Log.i("templatemethodmode","备料!");
        Log.i("templatemethodmode","烧锅加油!");
        makeProphaseIngredients();/******************************/
        Log.i("templatemethodmode","将菜倒入锅中翻炒!");
        makeLaterIngredients();/*********************************/
        Log.i("templatemethodmode","起锅装菜开吃!");/**/
    }

    protected abstract void introduceDish();
    protected abstract void makeLaterIngredients();
    protected abstract void makeProphaseIngredients();
}