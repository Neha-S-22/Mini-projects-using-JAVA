import java.util.Scanner;
public class Try_catch_Exception {

public static void main(String[] args) {
int a,b;
int quotient;
Scanner scanner = new Scanner(System.in);
System.out.println("Please enter first number (numerator) : ");

a = scanner.nextInt();
System.out.println("Please enter second number (denominator) : ");
b = scanner.nextInt();
try
{
quotient = a / b;
System.out.println ("Quotient = " + quotient);
}
catch(ArithmeticException ae)
{
System.out.println (ae);
}

}

}

