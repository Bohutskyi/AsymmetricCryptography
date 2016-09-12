package Lab1.generators;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/**
 * 3. Генератор псевдовипадкових двійкових послідовностей L20
 * Задається рекурентною формулою x(t) = x(t - 3) + x(t - 5) + x(t - 9) + x(t =20)
 */
public class L20Generator {

    private ArrayList<Integer> list = new ArrayList<>();

    {
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            list.add(random.nextInt(2));
        }
    }

    private int nextIteration() {
        int temp = list.get(0) ^ list.get(11) ^ list.get(15) ^ list.get(17);
        list.remove(0);
        list.add(temp);
        return temp;
    }

    public void toFile(String fileName, int length) {
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
