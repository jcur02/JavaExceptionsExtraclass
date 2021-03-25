import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowExample {

    public void readFile() throws FileNotFoundException {
        File file = new File("text.txt");
        FileReader fr = new FileReader(file);
        }

    public static void main(String[] args) throws FileNotFoundException {
        ThrowExample example = new ThrowExample();

        example.readFile();
    }
    }


