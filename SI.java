import java.util.Scanner;

class SI{
public static void main(String[] args)
{
 Scanner input=new Scanner(System.in);

 System.out.print("Enter the amount - ");
double num=input.nextDouble();
 System.out.println("Amount = " + num);

System.out.print("Enter the rate of interest in % - ");
double num1=input.nextDouble();
 System.out.println("Rate of interest = " + num1);

System.out.print("Enter the Time in years - ");
double num2=input.nextDouble();
 System.out.println("Time = " + num2);

double output=(num*num1*num2)/100;
System.out.println("The simple interest is "+output);

input.close();
}
}