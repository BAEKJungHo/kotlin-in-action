import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {

    public void fun () {
        Path filePath = Paths.get("d:\\example\\file.txt");
        try {
            Path newFilePath = Files.createFile(filePath);
            System.out.println(newFilePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
