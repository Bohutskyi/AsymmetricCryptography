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
        System.out.println("d: " + d.toString(16));
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

    public BigInteger[] digitalSignature(BigInteger M) {
        BigInteger[] result = new BigInteger[2];
        result[0] = new BigInteger(M.toString());
        result[1] = M.modPow(d, n);
        return result;
    }

    public boolean checkSignature(BigInteger[] sign, User sender) {
        return sign[1].modPow(sender.getE(), sender.getN()).equals(sign[0]);
    }

    public BigInteger[] sendVerification(User receiver, BigInteger newKey) {
        if (receiver.getN().compareTo(this.n) < 0) {
            return null;
        }
        BigInteger[] result = new BigInteger[2];
        result[0] = newKey.modPow(receiver.getE(), receiver.getN());
        BigInteger s = newKey.modPow(d, n);
        System.out.println("s: " + s.toString());
        System.out.println("s: " + s.toString(16));
        result[1] = s.modPow(receiver.getE(), receiver.getN());
        return result;
    }

    public BigInteger[] confidentiality(BigInteger[] message) {
        BigInteger[] result = new BigInteger[2];
        result[0] = message[0].modPow(d, n);
        result[1] = message[1].modPow(d, n);
        return result;
    }

    public BigInteger authentication(BigInteger[] message, User sender) {
        return message[1].modPow(sender.getE(), sender.getN());
    }


}
