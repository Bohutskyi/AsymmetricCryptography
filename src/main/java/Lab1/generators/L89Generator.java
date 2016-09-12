package Lab1.generators;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/**
 * 4. Генератор псевдовипадкових двійкових послідовностей L89
 */
public class L89Generator {

    private ArrayList<Integer> list = new ArrayList<>();

    {
        Random random = new Random();
        for (int i = 0; i < 89; i++) {
            list.add(random.nextInt(2));
        }
    }

    private int nextIteration() {
        int temp = list.get(0) ^ list.get(51);
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
