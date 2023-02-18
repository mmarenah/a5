import java.util.Scanner;

public class converter 
{
    public static void main(String[] args)
    {
        try (Scanner convert = new Scanner(System.in)) {
            System.out.println("Welcome to metric converter! \n Please input a number. \n enter -1 to exit program");
            int number = convert.nextInt();
            

            double miles = number * 0.62137;
            double pounds = number * 2.2046;
            double celsuis = number - 32 / 1.8;
            double minute = number / 60;

            switch (number)
            { 
             case -1:System.out.println("Thank you for using metric converter, goodbye!");
            break;

            default: System.out.println(number + " km equals " + miles + " miles");
            System.out.println(number + " kilograms equals " + pounds + " pounds");
            System.out.println(number + " degrees fariengheight equals " + celsuis +  " degrees celsuis");
            System.out.println(number + " seconds equals " + minute + " minutes");

            }
        }
        }
           }
     

           
        
