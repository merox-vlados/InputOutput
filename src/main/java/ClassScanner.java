import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ClassScanner {
    public static void main(String[] args) {
        File directory = new File("folder_scanner");
        File file = new File(directory,"names.txt");
//        try {
//            directory.mkdir();
//            file.createNewFile();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a: ");
        int a = scanner.nextInt();
        System.out.println("Enter b: ");
        int b = scanner.nextInt();
        System.out.println("Sum: " + (a + b));
    }
}
