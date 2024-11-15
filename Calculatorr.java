import java.util.*;


public class Calculatorr{
    public static void main(String[]args)
    {    
      Scanner sc = new Scanner(System.in);
   
      System.out.print("Enter first number: ");
      int fisrtNumber = sc.nextInt();
   
      System.out.print("Enter the second number: ");
      int secondNumber = sc.nextInt();
   
      System.out.print("Choose operator between +, -, *, / : ");
      char operator = sc.next().charAt(0);
   
      switch (operator){
       case '+':
       int addition = fisrtNumber + secondNumber;
       System.out.print("The sum is "+addition);
       break;
   
       case '-':
       int subtraction = fisrtNumber - secondNumber;
       System.out.print("The difference is "+subtraction);
       
    
              
       
       
       case '/':
       int division = fisrtNumber / secondNumber;
       System.out.print("The quotient is "+division);
       break;
   
       case '*':
       int multiplication = fisrtNumber * secondNumber;
       System.out.print("The multiplication is "+multiplication);
       break;

       default:
           System.out.print("Invalid operation");
           break;
      }
   
      
      }
   }