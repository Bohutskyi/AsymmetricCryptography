package Lab2;

import Lab1.generators.L20Generator;

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
//        System.out.println(ColorText.colorText("Any text", ColorText.ColorBase.MAGENTA));
        RSA rsa = new RSA(512);
        BigInteger message = new BigInteger(new L20Generator("10101011001101010111").generate(200), 2);
        System.out.println("Message:          " + message.toString());
        System.out.println("Message:          " + message.toString(16));
        BigInteger cipher = User.encrypt(message, rsa.getA());
        System.out.println("Cipher:           " + cipher.toString());
        System.out.println("Cipher:           " + cipher.toString(16));
        BigInteger decryptedMessage = rsa.getA().decrypt(cipher);
        System.out.println("decryptedMessage: " + decryptedMessage.toString());
        System.out.println("decryptedMessage: " + decryptedMessage.toString(16));
        System.out.println(message.equals(decryptedMessage));
        System.out.println("A.E: " + rsa.getA().getE().toString());
        System.out.println("A.E: " + rsa.getA().getE().toString(16));
        System.out.println("A.N: " + rsa.getA().getN().toString());
        System.out.println("A.N: " + rsa.getA().getN().toString(16));
    }

}
