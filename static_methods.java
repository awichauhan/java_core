class Mobile
{
    static String name = "smartphone";        // static variable
    int price;
    String brand;

    public void show(){
        System.out.println(name + " : " + price + " : " + brand);
    }

    public static void show1(){                // static method
        System.out.println(name + " : " + price + " : " + brand);
        //  cannot "directly" use non-static variables (brand,price)inside static method
        System.out.println("static method");
    }
}

public class static_methods
{
    public static void main (String a[]){    // making main static (we dont need to create an object of class "static_methods"
        Mobile mob1 = new Mobile();
        mob1.price = 120;
        mob1.brand = "apple";
        Mobile.name = "analog";           // making static reference to static variable 'name'
        mob1.show();

        Mobile.show1();                    // making static reference to static method show1()
    }
}