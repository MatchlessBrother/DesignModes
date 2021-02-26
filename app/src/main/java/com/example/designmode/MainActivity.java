package com.example.designmode;

import android.os.Bundle;
import com.example.myapplication.ReallyObj;
import com.example.myapplication.SingleMode;
import androidx.appcompat.app.AppCompatActivity;
import com.example.designmode.factorymode.Person;
import com.example.designmode.factorymode.Animal;
import com.example.designmode.decorationmode.DecorationObj;
import com.example.designmode.proxymode.cglibproxymode.Shopper;
import com.example.designmode.adaptermode.objadaptermode.Nurse;
import com.example.designmode.adaptermode.objadaptermode.NewNurse;
import com.example.designmode.adaptermode.objadaptermode.INewNurse;
import com.example.designmode.factorymode.methodfactory.NurseFactory;
import com.example.designmode.factorymode.simplefactory.PersonFactory;
import com.example.designmode.observermode.pullobservermode.Colleague;
import com.example.designmode.factorymode.methodfactory.PerrsonFactory;
import com.example.designmode.proxymode.cglibproxymode.PurchasingAgent;
import com.example.designmode.observermode.pullobservermode.Receptionist;
import com.example.designmode.factorymode.abstractfactory.IProvinceFactory;
import com.example.designmode.factorymode.abstractfactory.ScProvinceFactory;
import com.example.designmode.factorymode.methodfactory.AuxiliaryPolicyFactory;

public class MainActivity extends AppCompatActivity
{
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SingleMode singleMode = SingleMode.getInstance();
        /***************************************************************/
        ReallyObj reallyObj = new ReallyObj();
        DecorationObj decorationObj = new DecorationObj(reallyObj);
        decorationObj.eat();
        decorationObj.sleep();
        decorationObj.swiming();
        /***************************************************************/
        Receptionist receptionist = new Receptionist();
        Colleague colleague1 = new Colleague();
        receptionist.addObserver(colleague1);
        try
        {
            receptionist.sendLatestBossState("老板还在办公室忙!");
            Thread.sleep(2000l);
            receptionist.sendLatestBossState("老板走了!");
            Thread.sleep(2000l);
            receptionist.sendLatestBossState("老板回来了!");
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        /***************************************************************/
        Person p1 = PersonFactory.createPerson(PersonFactory.DOCTOR);
        p1.action();
        Person p2 = PersonFactory.createPerson(PersonFactory.POLICY);
        p2.action();
        /***************************************************************/
        PerrsonFactory perrsonFactory=new AuxiliaryPolicyFactory();
        Person person=perrsonFactory.createPerson();
        person.action();
        perrsonFactory=new NurseFactory();/***/
        person=perrsonFactory.createPerson();
        person.action();
        /***************************************************************/
        IProvinceFactory provinceFactory = new ScProvinceFactory();
        Person p = provinceFactory.createPerson();
        p.action();
        Animal a = provinceFactory.createAnimal();
        a.action();
        /***************************************************************/
        INewNurse nurse = new NewNurse(new Nurse());
        nurse.feedingMedicine();
        nurse.action();
        /***************************************************************/
        Shopper shopper = new Shopper();
        PurchasingAgent purchasingAgent = new PurchasingAgent();
        Shopper proxyShopper = (Shopper)purchasingAgent.getProxyInstance(this,shopper);
        proxyShopper.action();
        /***************************************************************/
    }
}