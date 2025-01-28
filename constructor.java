class Human
{
    public Human()   // no need of defining return type; name of constructor should be same as classname
    {
        /*
constructor is a special method which does not return anything
No need of specifically calling it in code/another class; it will still be called, everytime you create
the object of this class (instantiation of class)
         */
        System.out.println("Constructor is there");
        age = 12;      // defining default values to the variables ; can be changed later by calling this variable
        name = "mona";
    }
    /*
Idea of using constructor is to assign default values to the instance variables
Outside of constructor also, we could declare and assign the values to the instance variables
However, it is recommended to always perform any operation (like operations) inside a method (special meth called as constructor)
     */
    private int age;
    private String name;

    public String getName() {
        return name;
    }
    public void setName(String n)
    {
        name = n;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
}

public class constructor
{
    public static void main (String a[])
    {
        Human obj = new Human();         //
        // obj.setAge(26);
      //  obj.setName("Awi");
        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}


