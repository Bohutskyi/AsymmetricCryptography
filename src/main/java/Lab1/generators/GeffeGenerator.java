package Lab1.generators;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

/**
 *5. Генератор Джиффі
 */
public class GeffeGenerator {

    private static Random random = new Random();

    private static class LinearFeedbackShiftRegister1 {
        private int vector = random.nextInt();
        private static final int n = 11;

        public void setVector(int vector) {
            this.vector = vector;
        }

        public int getVector() {
            return vector;
        }

        public int getCurrentBit() {
            return vector & 1;
        }

        public int getNext() {
            int temp = ((vector >> 2) & 1) ^ ((vector) & 1);
            temp = temp & 1;
            vector = vector >> 1;
            vector = (vector ^ (temp << (n - 1)));
            return vector;
        }
    }

    private static class LinearFeedbackShiftRegister2 {
        private int vector = random.nextInt();
        private static final int n = 9;

        public void setVector(int vector) {
            this.vector = vector;
        }

        public int getVector() {
            return vector;
        }

        public int getCurrentBit() {
            return vector & 1;
        }

        public long getNext() {
            int temp = ((vector >> 3) & 1) ^ ((vector >> 2) & 1) ^ ((vector >> 1) & 1) ^ ((vector) & 1);
            temp = temp & 1;
            vector = vector >> 1;
            vector = (vector ^ (temp << (n - 1)));
            return vector;
        }
    }

    private static class LinearFeedbackShiftRegister3 {
        private int vector = random.nextInt();
        private static final int n = 10;

        public void setVector(int vector) {
            this.vector = vector;
        }

        public int getVector() {
            return vector;
        }

        public int getCurrentBit() {
            return vector & 1;
        }

        public long getNext() {
            int temp = ((vector >> 3) & 1) ^ ((vector) & 1);
            temp = temp & 1;
            vector = vector >> 1;
            vector = (vector ^ (temp << (n - 1)));
            return vector;
        }
    }

    private static LinearFeedbackShiftRegister1 l1 = new LinearFeedbackShiftRegister1();
    private static LinearFeedbackShiftRegister2 l2 = new LinearFeedbackShiftRegister2();
    private static LinearFeedbackShiftRegister3 l3 = new LinearFeedbackShiftRegister3();

    private static int getNext() {
        l1.getNext();
        l2.getNext();
        l3.getNext();
        if (l3.getCurrentBit() == 1) {
            return l1.getCurrentBit();
        } else {
            return l2.getCurrentBit();
        }
    }

    public static void toFile(String fileName, int length) {
        try {
            FileWriter writer = new FileWriter(fileName);
            for (int i = 0; i < length; i++) {
                writer.write(Integer.toString(getNext()));
            }
            writer.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}