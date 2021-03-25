import java.io.File;

public class TestCustomChecked {

    static void validateName(String pathname) throws AgeRestrictionException{
        if(!pathname.equals("text.txt"))
            throw new AgeRestrictionException("Not the suggested pathname");
        else
            System.out.println("Correct pathname");
    }

    public static void main(String args[]){
        try{
            File file = new File("text.txt");
            validateName(file.getName());
        }catch(Exception m){System.out.println("Exception occured: "+m);}

        System.out.println("Program Finished");
    }
}
