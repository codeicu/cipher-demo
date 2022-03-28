package org.example.cipher;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class DesDemoTest {

    @Test
    void t() {
        String text = "cyz";
        String seed = "12345678";
//        [52, -118, -42, -24, -4, 97, -73, -13]
        test(text,seed);
    }

    @Test
    void t2() {
        String text = "cyz";
        //seed只要大于等于8个字节即可，且只会用到前8个字节
        String seed = "123456789";
        //[52, -118, -42, -24, -4, 97, -73, -13]
        test(text,seed);
    }

    void test(String text,String seed){
        byte[] encrypt = DESDemo.encrypt(text.getBytes(),seed.getBytes());
        System.out.println(Arrays.toString(encrypt));
        byte[] decrypt = DESDemo.decrypt(encrypt,seed.getBytes());
        System.out.println(Arrays.toString(decrypt));
        assertEquals(text,new String(decrypt));
    }

}