package com.example.designmode

import java.util.*
import android.util.Log
import kotlin.collections.HashMap
import kotlin.collections.HashSet
import kotlin.collections.ArrayList

fun test()
{
    var kotlinList = listOf(1,2,3,4,5,6);
    var javaList = ArrayList<Int>(Arrays.asList(1,2,3,4,5,6));
    var kotlinMList = mutableListOf(1,2,3,4,5,6);
    Log.i("kotlin","--------------------------");
    javaList.forEach{
        Log.i("kotlin", "${it}")
    }
    Log.i("kotlin","--------------------------");
    for(it in javaList)
        Log.i("kotlin", "${it}")
    Log.i("kotlin","--------------------------");
    for(index in javaList.indices)
        Log.i("kotlin", "${javaList[index]}")
    if(6 in javaList)
        Log.i("kotlin", "true1");
    if(6 in kotlinList)
        Log.i("kotlin", "true2");
    if(6 in kotlinMList)
        Log.i("kotlin", "true3");

    Log.i("kotlin","++++++++++++++++++++++++++");
    Log.i("kotlin","++++++++++++++++++++++++++");
    Log.i("kotlin","++++++++++++++++++++++++++");

    var kotlinSet = setOf(1,2,3,4,5,6);
    var javaSet = HashSet<Int>(Arrays.asList(1,2,3,4,5,6));
    var kotlinMSet = mutableSetOf(1,2,3,4,5,6);
    Log.i("kotlin","--------------------------");
    kotlinMSet.forEach(){
        Log.i("kotlin", "${it}")
    }
    Log.i("kotlin","--------------------------");
    for(it in kotlinMSet)
        Log.i("kotlin", "${it}")
    Log.i("kotlin","--------------------------");
    var iterator = kotlinMSet.iterator();
    while(iterator.hasNext())
    {
        var it = iterator.next()
        Log.i("kotlin", "${it}")
    }
    if(6 in javaSet)
        Log.i("kotlin", "true1");
    if(6 in kotlinSet)
        Log.i("kotlin", "true2");
    if(6 in kotlinMSet)
        Log.i("kotlin", "true3");

    Log.i("kotlin","++++++++++++++++++++++++++");
    Log.i("kotlin","++++++++++++++++++++++++++");
    Log.i("kotlin","++++++++++++++++++++++++++");

    var javaMap = HashMap<String,Int>();
    javaMap.put("a",1);
    javaMap.put("b",2);
    javaMap.put("c",3);
    var kotlinMap = mapOf("a" to 1,"b" to 2, "c" to 3);
    var kotlinMMap = mutableMapOf("a" to 1,"b" to 2, "c" to 3);
    Log.i("kotlin","--------------------------");
    kotlinMMap.forEach(){
        Log.i("kotlin", "${it.key}:${it.value}")
    }
    Log.i("kotlin","--------------------------");
    for(it in kotlinMMap)
        Log.i("kotlin", "${it.key}:${it.value}")
    Log.i("kotlin","--------------------------");
    for(index in kotlinMMap.keys.indices)
        Log.i("kotlin", "${kotlinMMap.keys.elementAt(index)}:${kotlinMMap.get(kotlinMMap.keys.elementAt(index))}")

    if("a" in javaMap.keys)
        Log.i("kotlin", "true1");
    if("b" in kotlinMap.keys)
        Log.i("kotlin", "true2");
    if("c" in kotlinMMap.keys)
        Log.i("kotlin", "true3");

    var v1 = Pair(1,"a");
    val (x,y)= v1;

    val v2 = Triple(1,'a',"root");
    val (q,w,e) = v2;
}