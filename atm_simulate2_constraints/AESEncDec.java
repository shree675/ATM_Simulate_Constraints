/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.atm_simulate2_constraints;

import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/**
 *
 * @author Shreetesh M
 */
public class AESEncDec {                        // Implementing AES 128 algorithm - ref: https://www.includehelp.com/java-programs/encrypt-decrypt-string-using-aes-128-bits-encryption-algorithm.aspx
    
    public String encrypt128(String input){     // returns encrypted string of length 24
        try{
            Cipher c=Cipher.getInstance("AES/CBC/PKCS5PADDING");
            byte[] key="ABCDEFGHIJKLMNOP".getBytes("UTF-8");    // 16
            SecretKeySpec sc=new SecretKeySpec(key,"AES");
            IvParameterSpec iv=new IvParameterSpec(key);        // Initialization Vector
            c.init(Cipher.ENCRYPT_MODE, sc, iv);
            byte[] ct = c.doFinal(input.getBytes("UTF8"));
            Base64.Encoder encoder = Base64.getEncoder();
            String encrypted = encoder.encodeToString(ct);
            return encrypted;
        }
        catch(Exception e){
            e.printStackTrace();
            return "";
        }
    }
    
    public String decrypt128(String input){     // returns decrypted string
        try{
            Cipher c = Cipher.getInstance("AES/CBC/PKCS5PADDING");
            byte[] key = "ABCDEFGHIJKLMNOP".getBytes("UTF-8");
            SecretKeySpec sk = new SecretKeySpec(key, "AES");
            IvParameterSpec iv = new IvParameterSpec(key);
            c.init(Cipher.DECRYPT_MODE, sk, iv);
            Base64.Decoder decoder = Base64.getDecoder();
            byte[] ct = decoder.decode(input.getBytes("UTF8"));
            String decrypted = new String(c.doFinal(ct), "UTF-8");
            return decrypted;
        }
        catch(Exception e){
            e.printStackTrace();
            return "";
        }
    }
    
//    public static void main(String[] args){
//        AESEncDec en=new AESEncDec();
//        System.out.println(en.encrypt128("54321"));
//        System.out.println(en.encrypt128("98765"));
//        System.out.println(en.encrypt128("54321").length());
//        String a=en.encrypt128("hello afk afj");
//        System.out.println(en.decrypt128(a));
//    }
    
}
