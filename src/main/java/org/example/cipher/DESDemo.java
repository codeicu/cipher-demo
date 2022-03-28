package org.example.cipher;

import javax.crypto.*;
import javax.crypto.spec.DESKeySpec;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;

public class DESDemo {
    private static final String DES_STR = "DES";

    public static byte[] encrypt(byte[] text, byte[] seed) {
        try {
            DESKeySpec keySpec = new DESKeySpec(seed);
            SecretKeyFactory des = SecretKeyFactory.getInstance(DES_STR);
            SecretKey secretKey = des.generateSecret(keySpec);
            Cipher cipher = Cipher.getInstance(DES_STR);
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            byte[] content = cipher.doFinal(text);
            return content;
        } catch (Exception e) {
            return null;
        }
    }

    public static byte[] decrypt(byte[] text, byte[] seed) {
        try {
            DESKeySpec keySpec = new DESKeySpec(seed);
            SecretKeyFactory des = SecretKeyFactory.getInstance(DES_STR);
            SecretKey secretKey = des.generateSecret(keySpec);
            Cipher cipher = Cipher.getInstance(DES_STR);
            cipher.init(Cipher.DECRYPT_MODE, secretKey);
            byte[] res = cipher.doFinal(text);
            return res;
        } catch (Exception e) {
            return null;
        }
    }


}
