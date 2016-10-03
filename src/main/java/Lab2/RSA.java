package Lab2;

import Lab1.generators.L20Generator;

import java.math.BigInteger;

public class RSA {

    private User A, B;

    public RSA(int bitCount) {
        L20Generator l20Generator = new L20Generator("10010101001010110101");
        BigInteger pA, qA, pB, qB;
        int k = 20;
        pA = randomPrime(bitCount, k, l20Generator);
        qA = randomPrime(bitCount, k, l20Generator);
        pB = randomPrime(bitCount, k, l20Generator);
        do {
            qB = randomPrime(bitCount, k, l20Generator);
//        } while (pA.multiply(qA).compareTo(pB.multiply(qB)) <= 0);
        } while (pA.multiply(qA).compareTo(pB.multiply(qB)) > 0);
        A = new User(qA, pA);
        B = new User(qB, pB);
    }

    public static BigInteger randomPrime(int bitCount, int k, L20Generator l20Generator) {
        BigInteger result;
        do {
            result = new BigInteger(l20Generator.generate(bitCount), 2);
        } while (!MillerRabinTest.isPrime(result, k));
        return result;
    }

    public User getA() {
        return A;
    }

    public User getB() {
        return B;
    }
}
