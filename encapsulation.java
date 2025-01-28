// Binding the data (variable) with their methods is called encapsulation

class Human
{
    private int age;           // accessible only in same class
    private String name;      // everytime we create instance variable make it private

    public int getAge()            // to access the private variables using the method (indirect way)
    {
        return age;
    }

    public String getName()
    {
        return name;
    }

    public void setAge(int a)          // to set the value of the private variable
    {
        age = a;
    }

    public void setName(String b)
    {
        name = b;
    }
}

public class encapsulation
{
    public static void main (String a[])
    {
        Human obj = new Human();
        obj.setAge(26);                    // passing value to the private variable via its method
        obj.setName("Awi");
        System.out.println(obj.getName() + " : " + obj.getAge());   // calling private instance variables using the methods
    }
}

