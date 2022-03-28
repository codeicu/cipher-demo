package org.example.cipher;

import javax.crypto.*;
import javax.crypto.spec.DESKeySpec;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;

public class DesDemo {
    private static byte[] arr = {1,2,3,4,5,6,7,8};

    public static byte[] encrypt(byte[] text) throws InvalidKeyException, NoSuchAlgorithmException, InvalidKeySpecException, NoSuchPaddingException, BadPaddingException, IllegalBlockSizeException {
        DESKeySpec keySpec =new DESKeySpec(arr);
        SecretKeyFactory des = SecretKeyFactory.getInstance("DES");
        SecretKey secretKey = des.generateSecret(keySpec);
        Cipher cipher = Cipher.getInstance("DES");
        cipher.init(Cipher.ENCRYPT_MODE,secretKey);
        byte[] content = cipher.doFinal(text);
        return content;
    }

    public static byte[] decrypt(byte[] text){
        try {
            DESKeySpec keySpec = new DESKeySpec(arr);
            SecretKeyFactory des = SecretKeyFactory.getInstance("DES");
            SecretKey secretKey = des.generateSecret(keySpec);
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(Cipher.DECRYPT_MODE,secretKey);
            byte[] res = cipher.doFinal(text);
            return res;
        }catch (Exception e){
            return null;
        }
    }


}
