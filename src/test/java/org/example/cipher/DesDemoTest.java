package org.example.cipher;

import org.junit.jupiter.api.Test;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

import static org.junit.jupiter.api.Assertions.*;

class DesDemoTest {

    @Test
    void t() throws NoSuchPaddingException, NoSuchAlgorithmException, IllegalBlockSizeException, BadPaddingException, InvalidKeyException, InvalidKeySpecException {
        String text = "cyz";
        byte[] encrypt = DesDemo.encrypt(text.getBytes());
        byte[] decrypt = DesDemo.decrypt(encrypt);
        assertEquals(text,new String(decrypt));
    }

}