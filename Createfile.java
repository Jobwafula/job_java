import java.io.File;
import java.io.IOException;

public class Createfile {
    public static void main(String[] args) {
        try {
            File myobj = new File("filename.txt");
            if (myobj.createNewFile()) {
                System.out.println("file created :" + myobj.getName());
                
            } else {
                System.out.println("file exists");
            }
            
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("an error occured");
            e.printStackTrace();

        }
    }
    
}
