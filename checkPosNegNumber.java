import java.util.Scanner;

public class checkPosNegNumber{
    public static void main(String a[])
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number ");
        float number = scanner.nextFloat();

        if (number > 0)
            System.out.println("Positive value");
        else if (number < 0)
            System.out.println("Negative value");
        else
            System.out.println("Entered value is 0");

    }
}