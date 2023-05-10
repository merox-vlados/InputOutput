import java.io.*;

public class Main2 {
    public static void main(String[] args) {
        File directory = new File("folder_1");
        File file = new File(directory,"names.txt");

//        try (OutputStream outputStream = new FileOutputStream(file )) {
//            String names = "Nikolay Natasha August Kate Rodion Vlad Andrew Alex \n Nikolay Natasha August Kate Rodion Vlad Andrew Alex ";
//            outputStream.write(names.getBytes());
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        try (InputStream inputStream = new BufferedInputStream(new FileInputStream(file))) {
            long before = System.currentTimeMillis();
            int a = inputStream.read();
            StringBuilder result = new StringBuilder();
            while ( a != -1) {
                result.append((char) a);
                a = inputStream.read();
            }
            long after = System.currentTimeMillis();
            System.out.println(after - before);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
