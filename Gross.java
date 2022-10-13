import java.util.*;
public class Gross {
   

    public static void main(String[] args) {
        
        
        Gross employeeObj = new Gross();
        employeeObj.myEmployee();

    }

    static void myEmployee(){
        String employee1;
        String employee2;
        String employee3;
        Scanner employeeInput = new Scanner(System.in);
        System.out.println("employee 1 name");
    
        employee1 = employeeInput.next();
        employee1Hours();
        
        System.out.println("employee 2 name");
        employee2 = employeeInput.next();
        employee2Hours();
        System.out.println("employee 3 name");
        employee3 = employeeInput.next();
        employee3Hours();

    }
    static void employee1Hours(){
        int employee1Hours;

        Scanner input = new Scanner(System.in);
        System.out.println("hours for employee1");
        employee1Hours=input.nextInt();
        int salary;
        
        if (employee1Hours>40){

            System.out.println("Generate salary");
            
            salary = input.nextInt();
            salary = salary + salary/2;
            System.out.println("salary income :"+salary);
        }
        else if(employee1Hours<=40){
            System.out.println("Generate salary");
            salary = input.nextInt();
            System.out.println("salary :"+salary);

        }


        
    }
    static void employee2Hours(){
        int employee2Hours;

        Scanner input = new Scanner(System.in);
        System.out.println("hours for employee2");
        employee2Hours=input.nextInt();
        int salary;
        
        if (employee2Hours>40){

            System.out.println("Generate salary");
              
            salary = input.nextInt();
            salary = salary + salary/2;
            System.out.println("salary income :"+salary);
            
        }
        else if(employee2Hours<=40){
            System.out.println("Generate salary");
            salary = input.nextInt();
            System.out.println("salary :"+salary);

        }


        
    }
    static void employee3Hours(){
        int employee3Hours;

        Scanner input = new Scanner(System.in);
        System.out.println("hours for employee3");
        employee3Hours=input.nextInt();
        int salary;
        
        if (employee3Hours>40){
            System.out.println("Generate salary");
            salary = input.nextInt();
            salary = salary + salary/2;
            System.out.println("salary income :"+salary);
        }
        else if(employee3Hours<=40){
            System.out.println("Generate salary");
            salary = input.nextInt();
            System.out.println("salary :"+salary);

        }


        
    }
    
}
 

 