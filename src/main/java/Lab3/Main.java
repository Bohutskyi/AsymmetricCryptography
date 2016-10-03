package Lab3;

import additional.GCD;

import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

public class Main {

    private static final BigInteger TWO = new BigInteger("2");

    public static void main(String[] args) {
        BigInteger n = new BigInteger("0929D7CBA7071E3C2D02DE844CF2F8AD5A63E494A75F7B62EB279092E213D871C79F4DD0B397CD7C6C08583B77ED660D8C55AFFE980BEC8E71CB4BF80699C2D012C2AC16BA045F55D87ABE288ABCC09AFDBB33D8F6C0881EEF5C758A1352F100E871B69AD4D64F10FB20FDD567655828FF8DDAB403AC3B48975E864436CE44F4A1290D5F35BC67603F82B1FA5DE859632B6584AD406FE69D65E37D60B2AE93BD5992469A64EFC622DE8A18BA17CD195E841A46478B28CFDF255FA4CDB6DCA30FF367F0051EDA51685B9436A4ED39C3DB31A9794713EA16330938A5528580B7C3DE5650169D30002301375A852BC378CC1AC13A9BEED6E09265823BEA2371C29CD", 16);
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (true) {
            String temp = scanner.nextLine();
            if (temp.toLowerCase().equals("exit")) {
                System.out.println("count = " + count);
                break;
            }
            count++;
            BigInteger t = new BigInteger(512, new Random());
            System.out.println("y: " + t.modPow(TWO, n).toString(16));
            BigInteger z = new BigInteger(scanner.nextLine(), 16);
            System.out.println("z: " + z.toString(16));
            BigInteger gcd = GCD.gcd(t.add(z), n).getGcd();
            System.out.println("q: " + gcd.toString(16));
            BigInteger g = n.divide(gcd);
            System.out.println("g: " + g.toString(16));

            System.out.println(g.multiply(gcd).equals(n));

        }
    }

}
