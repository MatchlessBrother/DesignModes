package com.example.designmode.responsibilitychainmode;

public abstract class Manager
{
    protected Manager superiorManager;

    public Manager getSuperiorManager()
    {
        return superiorManager;
    }

    public void setSuperiorManager(Manager superiorManager)
    {
        this.superiorManager = superiorManager;
    }

    public abstract String handle(int leaveDays);
}