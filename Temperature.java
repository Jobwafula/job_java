import java.util.*;
public class  Temperature {
    public int celcius;
    public int fahreinheit;

    public void ceLcius(){
        // int celcius;
        Scanner input = new Scanner();
        fahreinheit = input.nextInt();

        celcius = (5.0/9.0)*(fahreinheit-32);
        System.out.println("celcius :"+celcius);
    }
    public void fahreinHeit(){
        // int fahreinheit;
        Scanner input = new Scanner();
        celcius = input.nextInt();
        fahreinheit = (9.0/5.0)*(celcius+32);
        System.out.println("fahreinheit :"+fahreinheit);
    }
    public static void main(String[] args) {
        Temperature temp = new Temperature();
        temp.ceLcius();
        temp.fahreinHeit();
    }
}

