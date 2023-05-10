import java.io.*;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class HW3 {
    public static void main(String[] args) {
        File directory = new File("folderNames");
        File file = new File("folderNames/names.txt");

        try {
            directory.mkdir();
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (Reader reader = new InputStreamReader(new FileInputStream(file))) {
            char[] buffer = new char[8];
            int count = reader.read(buffer);
            StringBuffer result = new StringBuffer();
            while (count > 0) {
                result.append(new String(buffer, 0, count));
                count = reader.read(buffer);
            }
            String[] arrayNames = result.toString().split(" ");
            Arrays.stream(arrayNames)
                    .filter(s -> s.startsWith("A"))
                    .forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
