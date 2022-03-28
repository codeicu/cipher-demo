package org.example.cipher;

import javax.crypto.Cipher;
import java.security.*;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;

public class RSADemo {
    static String algorithmName = "RSA";
    static Integer keySize = 1024;
    static PublicKey publicKey;
    static PrivateKey privateKey;

    public static void initKey() {
        try {
            KeyPairGenerator gen = null;
            gen = KeyPairGenerator.getInstance(algorithmName);
            gen.initialize(keySize);
            KeyPair keyPair = gen.generateKeyPair();
            publicKey = keyPair.getPublic();
            privateKey = keyPair.getPrivate();
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }

    public static byte[] encryptPublicKey(byte[] data){
        try {
//            X509EncodedKeySpec keySpec = new X509EncodedKeySpec(publicKey.getEncoded());
//            KeyFactory keyFactory = KeyFactory.getInstance(algorithmName);
//            PublicKey publicKey = keyFactory.generatePublic(keySpec);

            Cipher cipher = Cipher.getInstance(algorithmName);
            cipher.init(Cipher.ENCRYPT_MODE,publicKey);

            return cipher.doFinal(data);
        }catch (Exception e){
            return null;
        }
    }

    public static byte[] decryptPrivateKey(byte[] data){
        try {
//            PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(privateKey.getEncoded());
//            KeyFactory keyFactory = KeyFactory.getInstance(algorithmName);
//            PrivateKey publicKey = keyFactory.generatePrivate(keySpec);

            Cipher cipher = Cipher.getInstance(algorithmName);
            cipher.init(Cipher.DECRYPT_MODE,privateKey);

            return cipher.doFinal(data);
        }catch (Exception e){
            return null;
        }
    }
}
