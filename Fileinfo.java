import java.io.File;

public class Fileinfo {

    public static void main(String[] args) {
        File obj = new File("filename.txt");
        if (obj.exists()) {
            System.out.println("name :"+obj.getName());
            System.out.println("path :"+obj.getAbsolutePath());
            System.out.println("writable :"+obj.canWrite());
            System.out.println("readable :"+obj.canRead());
            System.out.println("file size in bytes :"+obj.length());
            
        } else {
            System.out.println("file doesnt exist");
        }
    }
    
}
