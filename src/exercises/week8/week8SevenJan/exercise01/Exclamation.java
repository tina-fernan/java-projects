package week8SevenJan.exercise01;

public class Exclamation implements Decryptor {

    @Override
    public boolean canDecrypt(String line) {
        return line.contains("!");
    }

    @Override
    public String decrypt(String line) {

        String replaced =line.replaceAll("!","");

        return replaced;

    }
}
