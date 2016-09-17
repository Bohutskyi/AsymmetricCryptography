package Lab1;

import Lab1.conversion.Conversion;
import Lab1.criterion.Test1;
import Lab1.criterion.Test2;
import Lab1.criterion.Test3;
import Lab1.generators.*;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    private static TreeMap<String, String> map = new TreeMap<>();

    public static void main(String[] args) {
//        JavaGenerator.toFile("data/1.txt", 1000000);

//        LehmerLowGenerator l = new LehmerLowGenerator();

//        L20Generator l20Generator = new L20Generator("10010110101110101010");
//        l20Generator.toFile("data/3.txt", 1000000);

//        L89Generator.toFile("data/4.txt", 1000000);
//        L89Generator l89Generator = new L89Generator("01010101101010101001001011010110111110000101010010101010100101010101010100101010101001010");
//        l89Generator.toFile("data/4.txt", 1000000);

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

//        Test1 test1 = new Test1("data/test/1.txt");
//        test1.check();

//        Test2 test2 = new Test2("data/test/1.txt");
//        test2.check();

//        Test3 test3 = new Test3("data/test/1.txt", 40);
//        test3.check();

//        Conversion.conversion("data/temp/6.txt", "data/test/6.txt");

//        String[] temp = {"1", "2.1", "2.2", "3", "4", "5", "6", "7", "8", "8.2", "9", "9.2"};
//        System.out.println("Test1");
//        for (String s : temp) {
//            System.out.println(s);
//            StringBuilder result = new StringBuilder("data/test/");
//            result.append(s);
//            result.append(".txt");
//            new Test1(result.toString()).check();
//        }

//        System.out.println("Test1");
//        new Test1("data/test/7.txt").check();
//        System.out.println("=============================");
//        System.out.println("Test2");
//        new Test2("data/test/7.txt").check();
//        System.out.println("=============================");
//        System.out.println("Test3");
//        new Test3("data/test/7.txt", 30).check();

    }

}
