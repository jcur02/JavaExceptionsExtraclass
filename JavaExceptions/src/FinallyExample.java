import java.io.*;

public class FinallyExample {

    public void readFileF() throws FileNotFoundException, IOException {
        File file1 = new File("text.txt");
        FileReader fr = new FileReader(file1);
        BufferedReader bf = new BufferedReader(fr);
        String line;

        while((line = bf.readLine()) !=null){
            System.out.println(line);
        }
    }
    public void findFile() {
        try {
            readFileF();
        } catch(FileNotFoundException ex) {
            System.out.println("File was not found, please check file pathname");
        } catch(IOException e){
            System.out.println("There was a Checked Exception");
        } finally {
            System.out.println("Program continues...");
        }

        System.out.println("Finished");
    }

    public static void main(String[] args) {
        FinallyExample example = new FinallyExample();

        example.findFile();
    }
}
