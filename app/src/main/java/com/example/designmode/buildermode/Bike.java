package com.example.designmode.buildermode;

public class Bike
{
    private String mIframe;
    private String mRearWheel;
    private String mFrontWheel;

    public Bike(){

    }

    public Bike(String mIframe, String mRearWheel, String mFrontWheel){
        this.mIframe = mIframe;
        this.mRearWheel = mRearWheel;
        this.mFrontWheel = mFrontWheel;
    }

    public String getmIframe(){
        return mIframe;
    }

    public void setmIframe(String mIframe){
        this.mIframe = mIframe;
    }

    public String getmRearWheel(){
        return mRearWheel;
    }

    public void setmRearWheel(String mRearWheel){
        this.mRearWheel = mRearWheel;
    }

    public String getmFrontWheel(){
        return mFrontWheel;
    }

    public void setmFrontWheel(String mFrontWheel){
        this.mFrontWheel = mFrontWheel;
    }
}