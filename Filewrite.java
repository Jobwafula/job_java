import java.io.FileWriter;
import java.io.IOException;

public class Filewrite {

    public static void main(String [] args){
    try {
        FileWriter myobj = new FileWriter("filename.txt");
        myobj.write("file writen successfully");
        myobj.close();
        System.out.println("file written successfully");
    } catch (Exception e) {
        // TODO: handle exception
        e.printStackTrace();
    }
}
    
}
