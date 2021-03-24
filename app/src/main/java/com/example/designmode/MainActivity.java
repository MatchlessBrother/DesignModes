package com.example.designmode;

import android.util.Log;
import android.os.Bundle;

import com.example.designmode.backupmode.BackupSecond;
import com.example.designmode.backupmode.BackupSecondManager;
import com.example.designmode.backupmode.Second;
import com.example.designmode.iteratormode.GameIterator;
import com.example.designmode.iteratormode.GameLevel;
import com.example.myapplication.ReallyObj;
import com.example.myapplication.SingleMode;
import com.example.designmode.buildermode.Bike;
import androidx.appcompat.app.AppCompatActivity;
import com.example.designmode.factorymode.Person;
import com.example.designmode.factorymode.Animal;
import com.example.designmode.prototypemode.Student;
import com.example.designmode.buildermode.TransContr;
import com.example.designmode.buildermode.BikeCreatorB;
import com.example.designmode.buildermode.BikeCreatorA;
import com.example.designmode.prototypemode.SuperStudent;
import com.example.designmode.templatemethodmode.CookDish;
import com.example.designmode.strategymode.PriceCalculator;
import com.example.designmode.decorationmode.DecorationObj;
import com.example.designmode.appearancemode.ActionWrapper1;
import com.example.designmode.appearancemode.IActionWrapper;
import com.example.designmode.proxymode.cglibproxymode.Shopper;
import com.example.designmode.adaptermode.objadaptermode.Nurse;
import com.example.designmode.responsibilitychainmode.NoHandler;
import com.example.designmode.templatemethodmode.MakeLianHuaBai;
import com.example.designmode.combinationmode.safetytypemode.Bag;
import com.example.designmode.combinationmode.safetytypemode.IBag;
import com.example.designmode.adaptermode.objadaptermode.NewNurse;
import com.example.designmode.adaptermode.objadaptermode.NewNurse;
import com.example.designmode.responsibilitychainmode.GradeTeacher;
import com.example.designmode.responsibilitychainmode.ClassTeacher;
import com.example.designmode.adaptermode.objadaptermode.INewNurse;
import com.example.designmode.templatemethodmode.MakeShuiZhuNiuRou;
import com.example.designmode.combinationmode.safetytypemode.Goods;
import com.example.designmode.adaptermode.objadaptermode.INewNurse;
import com.example.designmode.factorymode.methodfactory.NurseFactory;
import com.example.designmode.combinationmode.transparentmode.BaoBao;
import com.example.designmode.combinationmode.transparentmode.IThing;
import com.example.designmode.stateMode.falsestatemode.WeekendAction;
import com.example.designmode.factorymode.methodfactory.NurseFactory;
import com.example.designmode.factorymode.simplefactory.PersonFactory;
import com.example.designmode.observermode.pullobservermode.Colleague;
import com.example.designmode.factorymode.simplefactory.PersonFactory;
import com.example.designmode.observermode.pullobservermode.Colleague;
import com.example.designmode.stateMode.truestatemode.WeekendSchedule;
import com.example.designmode.responsibilitychainmode.PrincipalTeacher;
import com.example.designmode.combinationmode.transparentmode.ShangPin;
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
        String result = "";
        NoHandler noHandler = new NoHandler();
        ClassTeacher classTeacher = new ClassTeacher();
        GradeTeacher gradeTeacher = new GradeTeacher();
        PrincipalTeacher principalTeacher = new PrincipalTeacher();
        classTeacher.setSuperiorManager(gradeTeacher);
        gradeTeacher.setSuperiorManager(principalTeacher);
        principalTeacher.setSuperiorManager(noHandler);
        result = classTeacher.handle(2);
        if(!"".equals(result))Log.i("responsibilitychainmode","批准人：" + result);
        Log.i("responsibilitychainmode","******************************************");
        result = classTeacher.handle(6);
        if(!"".equals(result))Log.i("responsibilitychainmode","批准人：" + result);
        Log.i("responsibilitychainmode","******************************************");
        result = classTeacher.handle(8);
        if(!"".equals(result))Log.i("responsibilitychainmode","批准人：" + result);
        Log.i("responsibilitychainmode","******************************************");
        result = classTeacher.handle(12);
        if(!"".equals(result))Log.i("responsibilitychainmode","批准人：" + result);
        /******************************************************************************************/
        PriceCalculator normalCalculator = new PriceCalculator(PriceCalculator.NormalType);
        normalCalculator.getResultPrice(66.6d,12);
        PriceCalculator discountCalculator = new PriceCalculator(PriceCalculator.DiscountType);
        discountCalculator.getResultPrice(66.6d,12);
        PriceCalculator fullReturnCalculator = new PriceCalculator(PriceCalculator.FullReturnType);
        fullReturnCalculator.getResultPrice(66.6d,12);
        PriceCalculator perFullReturnCalculator = new PriceCalculator(PriceCalculator.PerFullReturnType);
        perFullReturnCalculator.getResultPrice(66.6d,12);
        /******************************************************************************************/
        SuperStudent st2 = null;
        SuperStudent st1 = new SuperStudent();st1.setStudent(new Student());
        st1.getStudent().setName("张三");st1.getStudent().setAge(22);st1.setSkill("cnm");
        try
        {
            st2  = (SuperStudent)st1.clone();
            st2.getStudent().setName("李四");
            st2.getStudent().setAge(18);
            st2.setSkill("mmp");
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
        Log.i("prototypemode","name:" + st1.getStudent().getName() + ",age:" +st1.getStudent().getAge() + ",kill:" + st1.getSkill() + ",address:" + st1.toString());
        Log.i("prototypemode","name:" + st2.getStudent().getName() + ",age:" +st2.getStudent().getAge() + ",kill:" + st2.getSkill() + ",address:" + st2.toString());
        /******************************************************************************************/
        CookDish cookDish = null;
        cookDish = new MakeLianHuaBai();
        cookDish.cookADish();
        cookDish = new MakeShuiZhuNiuRou();
        cookDish.cookADish();
        /******************************************************************************************/
        IActionWrapper actionWrapper = new ActionWrapper1();
        actionWrapper.gotoCompany();
        /******************************************************************************************/
        TransContr transContr = new TransContr(new BikeCreatorB());
        transContr.createBike();/**************one****************/
        /******************************************************************************************/
        TransContr.createBike();/**************two****************/
        /******************************************************************************************/
        for(int time = 0;time <= 24;time++)
        {
            WeekendSchedule weekendSchedule = new WeekendSchedule();
            weekendSchedule.cook(time);
            weekendSchedule.startReleaseTime(time);
        }
        /******************************************************************************************/
//        Bag bigBag = new Bag();
//        bigBag.setName("大袋子");
//        /*********************************/
//        Goods goods = new Goods();
//        goods.setName("李宁的鞋子");
//        goods.setValue(198f);
//        bigBag.addThing(goods);
//        /*********************************/
//        try
//        {
//            Bag whiteBag = new Bag();
//            whiteBag.setName("白色袋子");
//            Goods sgxg = (Goods)goods.clone();
//            sgxg.setName("韶关香菇");
//            sgxg.setValue(68f);
//            whiteBag.addThing(sgxg);
//            whiteBag.addThing((Goods)sgxg.clone());
//            Goods sghc = (Goods)goods.clone();
//            sghc.setName("韶关红茶");
//            sghc.setValue(180f);
//            whiteBag.addThing(sghc);
//            whiteBag.addThing((Goods)sghc.clone());
//            whiteBag.addThing((Goods)sghc.clone());
//            bigBag.addThing(whiteBag);
//        }
//        catch(CloneNotSupportedException e)
//        {
//            e.printStackTrace();
//        }
//        /*********************************/
//        try
//        {
//            Bag zhongBag = new Bag();
//            zhongBag.setName("中袋子");
//            Goods jdzcq = (Goods)goods.clone();
//            jdzcq.setName("景德镇瓷器");
//            jdzcq.setValue(380f);
//            zhongBag.addThing(jdzcq);
//            Bag redBag = new Bag();
//            redBag.setName("红色袋子");
//            Goods jytc = (Goods)goods.clone();
//            jytc.setName("婺源特产");
//            jytc.setValue(7.9f);
//            redBag.addThing(jytc);
//            redBag.addThing((Goods)jytc.clone());
//            Goods jydt = (Goods)goods.clone();
//            jydt.setName("婺源地图");
//            jydt.setValue(9.9f);
//            redBag.addThing(jydt);
//            zhongBag.addThing(redBag);
//            bigBag.addThing(zhongBag);
//        }
//        catch(CloneNotSupportedException e)
//        {
//            e.printStackTrace();
//        }
//        bigBag.showThings(0);
        /******************************************************************************************/
        IThing bao = new BaoBao();
        bao.setName("大袋子");
        /*********************************/
        IThing sp = new ShangPin();
        sp.setName("李宁的鞋子");
        sp.setValue(198f);
        bao.addThing(sp);
        /*********************************/
        try
        {
            IThing whiteBao = new BaoBao();
            whiteBao.setName("白色袋子");
            IThing sgxg = (IThing)sp.clone();
            sgxg.setName("韶关香菇");
            sgxg.setValue(68f);
            whiteBao.addThing(sgxg);
            whiteBao.addThing((IThing)sgxg.clone());
            IThing sghc = (IThing)sp.clone();
            sghc.setName("韶关红茶");
            sghc.setValue(180f);
            whiteBao.addThing(sghc);
            whiteBao.addThing((IThing)sghc.clone());
            whiteBao.addThing((IThing)sghc.clone());
            bao.addThing(whiteBao);
        }
        catch(CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
        /*********************************/
        try
        {
            IThing zhongBag = new BaoBao();
            zhongBag.setName("中袋子");
            IThing jdzcq = (IThing)sp.clone();
            jdzcq.setName("景德镇瓷器");
            jdzcq.setValue(380f);
            zhongBag.addThing(jdzcq);
            IThing redBag = new BaoBao();
            redBag.setName("红色袋子");
            IThing jytc = (IThing)sp.clone();
            jytc.setName("婺源特产");
            jytc.setValue(7.9f);
            redBag.addThing(jytc);
            redBag.addThing((IThing)jytc.clone());
            IThing jydt = (IThing)sp.clone();
            jydt.setName("婺源地图");
            jydt.setValue(9.9f);
            redBag.addThing(jydt);
            zhongBag.addThing(redBag);
            bao.addThing(zhongBag);
        }
        catch(CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
        bao.showThings(0);
        /******************************************************************************************/
        BackupSecondManager backupSecondManager = new BackupSecondManager();
        Second second = new Second();
        second.setLatestSecond(1);
        backupSecondManager.saveSecond(second.createBackupSecond());
        second.setLatestSecond(2);
        backupSecondManager.saveSecond(second.createBackupSecond());
        second.setLatestSecond(3);
        backupSecondManager.saveSecond(second.createBackupSecond());
        second.setLatestSecond(4);
        backupSecondManager.saveSecond(second.createBackupSecond());
        second.setLatestSecond(5);
        backupSecondManager.saveSecond(second.createBackupSecond());
        second.setLatestSecond(6);
        backupSecondManager.saveSecond(second.createBackupSecond());
        /**********************************************************/
        BackupSecond restoreBackupSecond = backupSecondManager.restoreSecond();
        while(null != restoreBackupSecond)
        {
            second.restoreBackupSecond(restoreBackupSecond);
            restoreBackupSecond = backupSecondManager.restoreSecond();
        }
        /******************************************************************************************/
        GameLevel gameLevel = new GameLevel();
        gameLevel.addChild(1);
        gameLevel.addChild(2);
        gameLevel.addChild(3);
        gameLevel.addChild(4);
        gameLevel.addChild(5);
        gameLevel.addChild(6);
        GameIterator iterator = (GameIterator) gameLevel.createIterator();
        iterator.calibrationIndex();
        while(iterator.hasNextChild())
        {
            Integer obj = (Integer) iterator.getNextChild();
            Log.i("iteratormode","取出元素:" + obj);
        }
        /******************************************************************************************/
    }
}