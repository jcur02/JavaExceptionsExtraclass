import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class TryExample {

    public void readFile() throws FileNotFoundException, IOException {
        File file = new File("text.txt");
        FileReader fr = new FileReader(file);
        BufferedReader bf = new BufferedReader(fr);
        String line;

        while((line = bf.readLine()) !=null){
            System.out.println(line);
        }
    }
    public void findFile() {
        try {
            readFile();
        } catch(FileNotFoundException ex) {
            System.out.println("File was not found, please check file pathname");
        } catch(IOException e){
            System.out.println("There was a Checked Exception");
        }

        System.out.println("Finished");
    }

    public static void main(String[] args) {
        TryExample example = new TryExample();

        example.findFile();
    }
}
