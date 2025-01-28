// using static keyword, we are making the variable as class member and not object
// we can call this variable with class name
// whatever value it stores; it will remain common for all objects; saving memory as well

class Mobile
{
    static String name = "smartphone";        // made this variable as common for all objects
    /*
    common variable for all the objects; should be called with class name i.e., Mobile.name = "analog"
     */
    int price;
    String brand;

    public void show(){
        System.out.println(name + " : " + price + " : " + brand);
    }
}

public class static_keyword
{
    public static void main (String a[]){
        Mobile mob1 = new Mobile();
        mob1.price = 120;
        mob1.brand = "apple";
        Mobile.name = "analog";  // calling static variable using class name (Mobile) and not with object name (mob1)
        /* changing this static variable value for one object (mob1) will change its value for all objects (mob2 as well)
         */
        mob1.show();

        Mobile mob2 = new Mobile();
        mob2.price = 50;
        mob2.brand = "samsung";
        mob2.show();
    }
}