package Lab1;

import Lab1.conversion.Conversion;
import Lab1.generators.*;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
//        JavaGenerator.toFile("data/1.txt", 1000000);

//        LehmerLowGenerator l = new LehmerLowGenerator();

//        L20Generator l20Generator = new L20Generator("10010110101110101010");
//        l20Generator.toFile("data/3.txt", 1000000);

//        L89Generator.toFile("data/4.txt", 1000000);
        L89Generator l89Generator = new L89Generator("01010101101010101001001011010110111110000101010010101010100101010101010100101010101001010");
        l89Generator.toFile("data/4.txt", 1000000);

//        GeffeGenerator.toFile("data/5.txt", 1000000);

//        LibraryGenerator.toFile("data/text.txt", "data/7.txt", 1000000);

//        BMGenerator.toFile("data/8.txt", 1000000);
//        BMGenerator.nextIteration();

//        BBSGenerator.toFile("data/9.txt", 1000000);

//        BBSGeneratorByBytes.toFile("data/9.2.txt", 1000000);

//        BMBytesGenerator bmBytesGenerator = new BMBytesGenerator();
//        bmBytesGenerator.toFile("data/8.2.txt", 234758934, 125000);

//        Conversion.conversion("data/9.txt", "data/test/9.txt");
//        SecureRandom random = new SecureRandom();
//        for (int i = 0; i < 10; i++) {
//            System.out.println(random.nextInt());
//        }
//
//        LehmerLowGenerator lehmerLowGenerator = new LehmerLowGenerator(27438234);
//        lehmerLowGenerator.toFile("data/2.1.txt", 125000);


//        LehmerHighGenerator lehmerHighGenerator = new LehmerHighGenerator(8649705);
//        lehmerHighGenerator.toFile("data/2.2.txt", 125000);


    }

}
