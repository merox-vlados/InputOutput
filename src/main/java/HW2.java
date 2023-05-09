import java.io.*;

public class HW2 {
    public static void main(String[] args) {
        File directory = new File("newFolder");
        File file1 = new File("newFolder/file1");

        try {
            directory.mkdirs();
            file1.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try(InputStream inputStream = new FileInputStream(file1)) {
            int a = inputStream.read();
            while ( a != -1) {
                System.out.print((char) a);
                a = inputStream.read();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
