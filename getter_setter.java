class Human
{
    private int age;
    private String name;
    /*
    Just right click on IDE > Generate > Getter and Setters > Select the variables and generate
    It will automatically create the below code for methods to get and set its value
     */
    public String getName() {
        return name;
    }

    public void setName(String n)        // typical way of using 2 variables to value assignment
    {
        name = n;
    }

    /*
here name is instance variable and n is local variable
to use same name for local and instance variable, this keyword is used
this represents the current object i.e., which is calling the setName method
     */

    public int getAge() {
        return age;
    }

    public void setAge(int age)           // using this keyword
    {
        this.age = age;
    }
}

public class getter_setter
{
    public static void main (String a[])
    {
        Human obj = new Human();
        obj.setAge(26);
        obj.setName("Awi");
        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}
