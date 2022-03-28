package org.example.cipher;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RSADemoTest {
    @Test
    void t(){
        String data = "cyz";
        RSADemo.initKey();
        byte[] encrypt = RSADemo.encryptPublicKey(data.getBytes());
        System.out.println(Arrays.toString(encrypt));
        byte[] decrypt = RSADemo.decryptPrivateKey(encrypt);
        System.out.println(Arrays.toString(decrypt));
        assertEquals(data,new String(decrypt));
    }

}