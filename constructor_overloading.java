class Human
{
    public Human()                  // default constructor
    {
        age = 12;
        name = "mona";
    }

    public Human(int a, String b)    // parameterized constructor
    {
        age = a;
        name = b;
    }

    public Human(String name){  // only one vaiable is defined; another variable's value can be passed with object
        int age = 12;
        this.name = name;
    }

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

public class constructor_overloading
{
    public static void main (String a[])
    {
        Human obj = new Human(12, "awantika");
        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}
