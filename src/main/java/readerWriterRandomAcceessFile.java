import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class readerWriterRandomAcceessFile {
    public static void main(String[] args) {
        File directory = new File("Folder_1");
        File file = new File("Folder_1/names.txt");

//        try {
//            directory.mkdirs();
//            file.createNewFile();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        try (RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r")) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter number of page or \"stop\" to exit");
            byte[] pageText = new byte[3000];
            String input = scanner.nextLine();
            while (!input.equals("stop")) {
                int page = Integer.parseInt(input);
                randomAccessFile.seek((page - 1) * pageText.length);
                int count = randomAccessFile.read(pageText);
                System.out.println(new String(pageText, 0, count));
                System.out.println("Enter number of page or \"stop\" to exit");
                input = scanner.nextLine();
            }
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}
