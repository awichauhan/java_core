import java.util.Scanner;

public class gradingSystem
{
    public static void main(String a[])
    {
       Scanner scanner = new Scanner(System.in);

       System.out.print("Enter the obtained marks ");
       int obtainedMarks = scanner.nextInt();

       if (obtainedMarks > 80)
           System.out.println("your grade is A");
       else if (obtainedMarks > 60 && obtainedMarks < 80)
           System.out.println("Your grade is B");
       else if (obtainedMarks > 30 && obtainedMarks <60)
           System.out.println("Your grade is C");
       else
           System.out.println("Your grade is D");
    }
}