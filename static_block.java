// everytime we create an object; class loads (once) and then objects are instantiated
// JVM has "class loader" and it loads the class only once

/* when class loads, it loads the static module first and then the constructor is loaded. so the static block is called
first during code execution, then the constructor

OUTPUT:
awantikachauhan@Awantikas-MacBook-Air java_core % java static_block
in static block
in constructor
in constructor
 */

class MOBILE1
{
    int price;
    String brand;

    public MOBILE1()                 // constructor
    {
        brand = "";
        price = 200;
        System.out.println("in constructor");
    }

    static                          // static block (going to be called only once with class load)
    {
        String name = "smartphone";
        System.out.println("in static block");
    }
}

public class static_block
{
    public static void main (String a[]) throws ClassNotFoundException
    {
        Class.forName("MOBILE1");  // this will run system class loader and will cause the static block to be called (instantiate)

        /*                        IT WILL not load the class if we dont create an object
        MOBILE1 obj1 = new MOBILE1();
        obj1.brand = "Apple";
        obj1.price = 1500;

        MOBILE1 obj2 = new MOBILE1();
     */
    }
}