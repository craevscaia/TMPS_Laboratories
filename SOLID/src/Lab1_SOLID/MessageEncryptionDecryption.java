package Lab1_SOLID;

public class MessageEncryptionDecryption {
    private CaesarCipher caesarCipher;
    private CaesarCipherPermutation caesarCipherPermutation;

    public void store(String text, int key, CaesarCipher caesarCipher ){
        String encryptedText = caesarCipher.encrypt(text, key);
        System.out.println(encryptedText);
        String decryptedText = caesarCipher.decrypt(encryptedText, key);
        System.out.println(decryptedText);
    }

}
