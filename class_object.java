// object: have some properties and behaviors
// class is a blueprint; you design an object in class; it will have properties and methods

class Calculator                                 /* new class */
{
    int a;                                       /* variable of the class */
    public int add(int x, int y)                 /* method of a class */
    {
        int sum = x + y;
        return sum;
    }
}

public class class_object                             /*  different class; class name is same as filename as it is important to run the class*/
{
    public static void main(String a[]) {
        Calculator calc = new Calculator();            // object is a instantiation of the class
        int result = calc.add(5,6);                    // passing parameters to the method
        System.out.println(result);
    }
}

// another way to pass the parameters to the method:

public class class_object
{
    public static void main(String a[]) {
        int num1 = 5;
        int num2 = 6;
        Calculator calc = new Calculator();
        int result = calc.add(num1, num2);
        System.out.println(result);
    }
}