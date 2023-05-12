package FinalHW;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Cat> listCats = new ArrayList<>();
        listCats.add(new Cat("Tom", "Bengal", 5));
        listCats.add(new Cat("Mary", "Siamese", 6));
        listCats.add(new Cat("Max", "Siberian", 4));

        File file = new File("catList.cat");
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file))) {
            objectOutputStream.writeObject(listCats);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {
            List<Cat> savedListCats = (List<Cat>) objectInputStream.readObject();
            for(Cat cat : savedListCats) {
                System.out.println(cat);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
