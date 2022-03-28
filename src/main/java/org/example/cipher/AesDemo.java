package org.example.cipher;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.SecretKeySpec;

public class AesDemo {
    private static final String AES_STR = "AES";


    public static byte[] encrypt(byte[] text, byte[] seed) {
        try {
            SecretKeySpec keySpec = new SecretKeySpec(seed,AES_STR);
            Cipher cipher = Cipher.getInstance(AES_STR);
            cipher.init(Cipher.ENCRYPT_MODE, keySpec);
            byte[] content = cipher.doFinal(text);
            return content;
        }catch (Exception e){
            return null;
        }
    }

    public static byte[] decrypt(byte[] text,byte[] seed){
        try {
            SecretKeySpec keySpec = new SecretKeySpec(seed,AES_STR);
            Cipher cipher = Cipher.getInstance(AES_STR);
            cipher.init(Cipher.DECRYPT_MODE, keySpec);
            byte[] content = cipher.doFinal(text);
            return content;
        }catch (Exception e){
            return null;
        }
    }


}
