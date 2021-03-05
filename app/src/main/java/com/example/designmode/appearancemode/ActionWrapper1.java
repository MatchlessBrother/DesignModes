package com.example.designmode.appearancemode;

public class ActionWrapper1 implements IActionWrapper
{
    private Walk mWalk;
    private TakeSubway mTakeSubway;

    public ActionWrapper1()
    {
        mWalk = new Walk();
        mTakeSubway = new TakeSubway();
    }

    public void gotoCompany()
    {
        mWalk.toSubway();
        mTakeSubway.toCompanySubway();
        mWalk.toCompany();/**********/
    }
}