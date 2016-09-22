package Lab2;

import Lab1.generators.L20Generator;

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
//        System.out.println(ColorText.colorText("Any text", ColorText.ColorBase.MAGENTA));
        L20Generator l20Generator = new L20Generator("10001110010101010011");
        String temp = l20Generator.generate(512);
        System.out.println(temp);
        System.out.println(new BigInteger(temp, 2).toString());
        System.out.println(new BigInteger(temp, 2).toString(16));
    }

}
