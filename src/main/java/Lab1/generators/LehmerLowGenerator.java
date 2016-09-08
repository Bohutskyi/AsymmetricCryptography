package Lab1.generators;

import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Random;

/**
 * Лінійний конгруентний генератор (генератор Лемера)
 * старші 8 біт
 * можливий -
 * */
public class LehmerLowGenerator {

    private static final BigInteger m = new BigInteger("4294967296");
    private static final BigInteger a = new BigInteger("65537");
    private static final BigInteger c = new BigInteger("119");
//    private static BigInteger x = new BigInteger(Integer.toString(Math.abs(new Random().nextInt())));
    private static BigInteger x = new BigInteger("1029252855");

    static {
        System.out.println("x = " + x);
        x = ((x.multiply(a)).add(c)).mod(m);
        int f = x.intValue();
        System.out.println(x);
        System.out.println(f);
        System.out.println(Integer.toBinaryString(f));
        x = ((x.multiply(a)).add(c)).mod(m);
         f = x.intValue();
        System.out.println(x);
        System.out.println(f);
        System.out.println(Integer.toBinaryString(f));
        x = ((x.multiply(a)).add(c)).mod(m);
        f = x.intValue();
        System.out.println(x);
        System.out.println(f);
        System.out.println(Integer.toBinaryString(f));
        System.out.println();
    }

    private void iteration() {
        x = ((x.multiply(a)).add(c)).mod(m);
    }

    public static void toFile(String fileName, int length) {
        try {
            FileWriter writer = new FileWriter(fileName);
            for (int i = 0; i < length; i++) {
//                writer.write();
            }
            writer.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }


}
