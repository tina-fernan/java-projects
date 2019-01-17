package exercises.cesar;

public class CaesarApplication {
    public static void main(String[] args) {
        Caesar caesar = new Caesar();
        String encryptedMessage = caesar.encrypt("hello, world! ", 13);
        System.out.println(encryptedMessage);
    }
}