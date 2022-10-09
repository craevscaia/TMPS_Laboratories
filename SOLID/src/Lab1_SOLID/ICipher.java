package Lab1_SOLID;

public interface ICipher {
    String encrypt(String text, int key);
    String decrypt(String encryptedText, int key);
}
