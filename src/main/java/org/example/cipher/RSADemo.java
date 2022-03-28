package org.example.cipher;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;

public class RSADemo {
    static String algorithm = "RSA";
    static Integer keySize = 1024;
    static PublicKey publicKey;
    static PrivateKey privateKey;

    public static void initKey() {
        try {
            KeyPairGenerator gen = null;
            gen = KeyPairGenerator.getInstance(algorithm);
            gen.initialize(keySize);
            KeyPair keyPair = gen.generateKeyPair();
            publicKey = keyPair.getPublic();
            privateKey = keyPair.getPrivate();
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }

    public static byte[] encryptPublicKey(){
        return null;
    }
}
