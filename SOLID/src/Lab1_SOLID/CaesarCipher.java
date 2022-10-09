package Lab1_SOLID;

public class CaesarCipher implements ICipher {
    static String alphabet = "abcdefghijklmnopqrstuvwxyz";
    @Override
    public String encrypt(String text, int key) {
        text = text.toLowerCase();
        StringBuilder encryptedText = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            if(text.charAt(i) == ' '){
                encryptedText.append(" ");
                continue;
            }
            int charIndex = alphabet.indexOf(text.charAt(i));
            int newIndex = (charIndex + key) % 26;
            encryptedText.append(alphabet.charAt(newIndex));
        }

        return encryptedText.toString();
    }

    @Override
    public String decrypt(String encryptedText, int key) {
        encryptedText = encryptedText.toLowerCase();
        String decryptedText = "";
        for (int i = 0; i < encryptedText.length(); i++) {
            int charIndex = alphabet.indexOf(encryptedText.charAt(i));
            int newIndex = (charIndex - key) % 26;
            if(newIndex < 0){
                newIndex = alphabet.length() + 26;
            }
            char decryptedChar = alphabet.charAt(newIndex);
            decryptedText += alphabet.charAt(newIndex);
        }

        return decryptedText;
    }
}
