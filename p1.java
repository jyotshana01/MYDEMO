package exampleProgram;
import java.util.scanner;

public class p1 {
    public static void main(String[] args) {

   int num1,num2,result;
   scanner input = new scanner(System.in);
   System.out.println("Enter the Number 1");
   num1 = input.nextInt();
   System.out.println("Enter the Number 2");
   num2 = input.nextInt();
   input.close();

  result = num1 + num2;

  System.out.printf("%d + %d = &d",num1,num2,result);

   }

}