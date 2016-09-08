package Lab1.generators;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/**
 * 3. Генератор псевдовипадкових двійкових послідовностей L20
 */
public class L20Generator {

    private static ArrayList<Integer> list = new ArrayList<>();

    static {
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            list.add(random.nextInt(2));
        }
    }

    private static int nextIteration() {
        int temp = list.get(0) ^ list.get(11) ^ list.get(15) ^ list.get(17);
        list.remove(0);
        list.add(temp);
        return temp;
    }

    public static void toFile(String fileName, int length) {
        try {
            FileWriter writer = new FileWriter(fileName);
            for (int i = 0; i < length; i++) {
                writer.write(Integer.toString(nextIteration()));
            }
            writer.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
