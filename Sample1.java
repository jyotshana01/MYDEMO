package exampleProgram;
import java.util.Scanner;

public class Sample1 { 
    public static void main(String args[]) {

   int num1,num2,result;
   
   System.out.println("Enter the Number 1");
   num1 = input.nextInt();
   System.out.println("Enter the Number 2");
   num2 = input.nextInt();
   input.close();

  result = num1 + num2;

  System.out.printf("%d + %d = &d",num1,num2,result);

   }

}
