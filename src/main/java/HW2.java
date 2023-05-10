import java.io.*;
import java.nio.charset.StandardCharsets;

public class HW2 {
    public static void main(String[] args) {
        File directory = new File("newFolder");
        File file1 = new File("newFolder/file1.txt");

        try {
            directory.mkdirs();
            file1.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try(Reader reader = new InputStreamReader(new FileInputStream(file1))) {
        int a = reader.read();
            StringBuilder result = new StringBuilder();
            while (a > 0) {
                result.append((char) a);
                a = reader.read();
            }
            System.out.println(result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
