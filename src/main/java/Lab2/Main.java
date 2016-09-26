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
        System.out.println("B.E: " + rsa.getB().getE().toString());
        System.out.println("B.E: " + rsa.getB().getE().toString(16));
        System.out.println("B.N: " + rsa.getB().getN().toString());
        System.out.println("B.N: " + rsa.getB().getN().toString(16));
        System.out.println(rsa.getB().getE().multiply(rsa.getB().getN()).compareTo(rsa.getA().getE().multiply(rsa.getA().getN())));
        System.out.println("----------------------------------------Signature-------------------------------------------");
//        BigInteger newKey = new BigInteger("13491239543289265");
        BigInteger newKey = new BigInteger("13491201023439543289265");
        System.out.println("New Key: " + newKey.toString());
        System.out.println("New Key: " + newKey.toString(16));


        System.out.println("*********************************************************************************");
        BigInteger[] t = rsa.getA().digitalSignature(newKey);
        for (BigInteger i : t) {
            System.out.println(i.toString(16));
        }
        System.out.println(rsa.getB().checkSignature(t, rsa.getA()));
        System.out.println("*********************************************************************************");
        BigInteger[] temp = rsa.getA().sendVerification(rsa.getB(), newKey);
        System.out.println();
        System.out.println("--------------------sendVerification-------------------------------------------");
        for (BigInteger i : temp) {
            System.out.println(i.toString());
            System.out.println(i.toString(16));
        }
        System.out.println();
        System.out.println("--------------------confidentiality-------------------------------------------");
        temp = rsa.getB().confidentiality(temp);
        for (BigInteger i : temp) {
            System.out.println(i.toString());
            System.out.println(i.toString(16));
        }
        System.out.println();
        System.out.println("--------------------authentication-------------------------------------------");
        System.out.println(rsa.getB().authentication(temp, rsa.getA()).toString());
        System.out.println(rsa.getB().authentication(temp, rsa.getA()).toString(16));

    }

}
