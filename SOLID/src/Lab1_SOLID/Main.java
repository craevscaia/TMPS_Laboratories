package Lab1_SOLID;

public class Main {
    public static void main(String[] args) {
        MessageEncryptionDecryption message =new MessageEncryptionDecryption();
        message.store("Valentina", 4, new CaesarCipher());
    }
}
