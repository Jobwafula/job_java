
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Fileread {
    public static void main(String[] args) {
        try {
            File name = new File("filename.txt");
            Scanner read = new Scanner(name);

            while(read.hasNextLine()){
            String data = read.nextLine();
            System.out.println(data);
            }
            
        } catch (FileNotFoundException e) {
            // TODO: handle exception
            System.out.println("an error occured");
            e.printStackTrace();
        }
    
    }
    
}
