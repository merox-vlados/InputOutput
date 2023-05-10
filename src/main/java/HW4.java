import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class HW4 {
    public static void main(String[] args) {
        File directory = new File("folder_HW");
        File file = new File(directory,"names.txt");
        try(OutputStream outputStream = new BufferedOutputStream(new FileOutputStream(file, true))) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter name or \"stop\" to exit");
            String next = scanner.nextLine();
            while (!next.equals("stop")) {
                outputStream.write(next.getBytes());
                outputStream.write("\n".getBytes());
                next = scanner.nextLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try(InputStream inputStream = new BufferedInputStream(new FileInputStream(file))) {
            byte[] array = new byte[128];
            int count = inputStream.read(array);
            StringBuilder result = new StringBuilder();
            while (count > 0) {
                result.append(new String(array, 0, count));
                count = inputStream.read(array);
            }
            System.out.println(result.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }


//        String name = "";
////        while (!name.equals("Выход")) {
////            Scanner scanner = new Scanner(System.in);
////            System.out.println("Enter name: ");
////            name = scanner.nextLine();
////            try (OutputStream outputStream = new BufferedOutputStream(new FileOutputStream(file, true))){
////                if(!(name.equals("Выход"))) {
////                    outputStream.write(name.getBytes());
////                }
////            } catch (Exception e) {
////                e.printStackTrace();
////            }
////        }
////        try (Reader reader = new BufferedReader(new FileReader(file))) {
////            int s = reader.read();
////            StringBuilder result = new StringBuilder();
////            while (s != -1 ) {
////                result.append((char) s);
////                s = reader.read();
////            }
////            System.out.println(result.toString());
////        } catch (Exception e) {
////            e.printStackTrace();
////        }
    }
}
