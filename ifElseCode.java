import java.util.Scanner;

public class ifElseCode
{
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        //CODE TO PRINT ODD NUMBER:

        if (number % 2 == 0)
        {
            System.out.println(number + " is a ODD number");
        }
        else{
            System.out.println(number + " is a EVEN number");
        }

        // CODE TO PRINT GREATER NUMBER

        System.out.print("Enter two number: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        if(num1 > num2)
        {
            System.out.println(num1 + " is greater");
        }
        else{
            System.out.println((num2 + " is great"));
        }

        // CODE TO CHECK IF CURRENT YEAR IS LEAP YEAR

        System.out.print("Enter the current year ");
        int year = scanner.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
        {
            System.out.println(year + " is a leap year");
        }
        else {
            System.out.println(year + " is not a leap year");
        }
    }

}
