package com.netease.nim.uikit.common.util;

import java.security.Key;
import javax.crypto.Cipher;
import android.util.Base64;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.SecretKeySpec;

public final class DeEncryptUtils
{
    private Key key;
    private Cipher cipher;
    private static DeEncryptUtils mInstance;
    private static final String FRAME_KEY_STR= "ytskj13698887654";

    public synchronized static DeEncryptUtils getInstance()
    {
        if (mInstance == null)
        {
            mInstance = new DeEncryptUtils();
        }
        return mInstance;
    }

    private DeEncryptUtils()
    {
        try
        {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("aes");
            keyGenerator.init(128);/**初始化key的长度,只能是128.*/
            SecretKeySpec skeySpec = new SecretKeySpec(FRAME_KEY_STR.getBytes(),"AES");
            byte[] keyBytes = skeySpec.getEncoded();/************得到key的字节数组****************/
            key = new SecretKeySpec(keyBytes, "aes");/*******转换字节数组为key**********/
            cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");/***加解密方式+工作模式+填充方式***/
        }
        catch(Exception ex)
        {

        }
    }

    public String encryptStr(String str)
    {
        String encodeMsg = "";
        try
        {
            /*********以加密模式初始化************/
            cipher.init(Cipher.ENCRYPT_MODE,key);
            byte[] result = cipher.doFinal(str.getBytes());
            encodeMsg = Base64.encodeToString(result,Base64.DEFAULT);
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return encodeMsg.replace("\n","");
    }

    public String decryptStr(String str)
    {
        String encodeMsg = "";
        try
        {
            /*********以解密模式初始化************/
            cipher.init(Cipher.DECRYPT_MODE,key);
            byte[] result = cipher.doFinal(Base64.decode(str,Base64.DEFAULT));
            encodeMsg = new String(result);
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return encodeMsg;
    }
}