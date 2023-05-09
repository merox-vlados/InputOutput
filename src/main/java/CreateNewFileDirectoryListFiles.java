import java.io.File;
import java.io.IOException;

public class CreateNewFileDirectoryListFiles {
    public static void main(String[] args) {
        File directory = new File("folder/folder2/folder1");
        File file = new File("folder/folder2/folder1/file1.txt");
        File file2 = new File("folder/folder2/folder1/file2.txt");
        File file3 = new File("folder/folder2/folder1/file3.txt");
        try {
            directory.mkdirs();
            file2.createNewFile();
            file.createNewFile();
            file3.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        File[] files = directory.listFiles((dir, name) -> name.contains("1"));
        for (File f : files) {
            System.out.println(f.getName());
        }
    }
}
