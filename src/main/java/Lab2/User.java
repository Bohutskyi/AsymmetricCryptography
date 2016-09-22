package Lab2;

import additional.GCD;

import java.math.BigInteger;

public class User {
    private static final String candidate = "65537";

    //(n, e) - public key, d - private key
    private BigInteger q, p, n, fn, e, d;

    public User(BigInteger q, BigInteger p) {
        this.q = q;
        this.p = p;
        this.n = q.multiply(p);
        this.fn = (q.subtract(BigInteger.ONE)).multiply(p.subtract(BigInteger.ONE));
        this.e = new BigInteger(candidate);
        this.d = GCD.getReverse(e, fn);
    }

    public BigInteger getN() {
        return n;
    }

    public BigInteger getE() {
        return e;
    }

    public static BigInteger encrypt(BigInteger M, User receiver) {
        return M.modPow(receiver.getE(), receiver.getN());
    }

    public BigInteger decrypt(BigInteger C) {
        return C.modPow(d, n);
    }

    

}
