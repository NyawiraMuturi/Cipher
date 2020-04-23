import org.junit.Test;

import static org.junit.Assert.*;

public class CipherTest {

    @Test
    public void Cipher_testingEncryptingmethod() {
        Cipher cipher =new Cipher();
        assertEquals("eqy",cipher.encrypt("cow",2));
    }

    @Test
    public void Cipher_testingDecryptingMethod() {
        Cipher cipher =new Cipher();
        assertEquals("cow",cipher.decrypt("eqy",2));
    }


}