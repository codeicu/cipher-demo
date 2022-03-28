package org.example.cipher;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AesDemoTest {

    @Test
    void t() {
        String text = "cyz";
        String seed = "1234567812345678";
//[-15, 115, 79, 31, -59, -17, 25, 16, -19, -18, -91, -120, 106, 91, 91, 44]
    }

    @Test
    void t2() {
        String text = "cyz";
        //seed只能=16个字节
        String seed = "1234567812345678";
        //[52, -118, -42, -24, -4, 97, -73, -13]
        test(text,seed);
    }

    void test(String text,String seed){
        byte[] encrypt = AESDemo.encrypt(text.getBytes(),seed.getBytes());
        System.out.println(Arrays.toString(encrypt));
        byte[] decrypt = AESDemo.decrypt(encrypt,seed.getBytes());
        System.out.println(Arrays.toString(decrypt));
        assertEquals(text,new String(decrypt));
    }

}