

public class Calc {
    public static void main(String args[]) {
     int n1,n2,n3;
     input = new input (System.in);
     system.out.println("Enter First Number");
     n1 = input.nextInt();
     system.out.println("Enter Second Number");
     n2 = input.nextInt();
     system.out.println("Choices Are:");
     system.out.println("2. Substraction");
     system.out.println("3. Multiplication");
     system.out.println("4. Division");
     system.out.println("Enter Your Choices Are:");
     ch = input.nextInt();
     switch(ch)
     {
          case 1:
               n3 = n1 + n2;
               system.out.println("Addition = "+n3);
               break;
          case 2:
               n3 = n1 - n2;
               system.out.println("Substraction = "+n3);
               break;
           case 3:
               n3 = n1 * n2;
               system.out.println("Multiplication = "+n3);
               break;
           case 4:
               n3 = n1 / n2;
               system.out.println("Division = "+n3);
               break;
           default:
                system.out.println("You have Entered wrong Choice");
       }
     }
}
