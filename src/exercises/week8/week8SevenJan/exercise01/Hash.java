package week8SevenJan.exercise01;


public class Hash implements Decryptor {


    @Override
    public boolean canDecrypt(String line) {

        return line.contains("#");
    }

    @Override
    public String decrypt(String line) {

        String message=line.replaceAll("#","");
        String secret = message.replaceAll("robomime","");

        return secret;
    }
}
