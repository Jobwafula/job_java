package test;

import java.math.BigInteger;

public class Fibonacci {


    public static BigInteger fibonacci(BigInteger number){

        if (number.equals(BigInteger.ZERO) || 
        number.equals(BigInteger.ONE))
        {
            return number;
        }
        
        else {
            return fibonacci(number.subtract(BigInteger.ONE)).add(
            fibonacci(number.subtract(BigInteger.TWO))
            );
        }
            
        
        }
        

    


    public static void main(String[] args) {

        for(int count=0;count<=40;count++){
            System.out.printf("fibonacci of %d is : %d \n",count,fibonacci(BigInteger.valueOf(count)));

        }
        
    }
    
}
