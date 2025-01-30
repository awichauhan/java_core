/*
every class in java extends from OBJECT class
 */

class Laptop{
    String model;
    int price;

    public String toString(){ // implementing toString method in subclass (Laptop) instead of calling it from superclass OBJECT
        return model + " : " + price;
    }

    public boolean equals(Laptop that) {
        // this is to override "equals" method coming from OBJECT class (which compares 2 objects based on their hashcode)
        if (this.model.equals(that.model) && this.price == that.price)
            return true;
        else
            return false;
    }
}

public class objectClass{
    public static void main(String a[]){
        Laptop obj = new Laptop();
        obj.model = "lenovo yoga";
        obj.price = 22222;

        Laptop obj1 = new Laptop();
        obj1.model = "lenovo yoga";
        obj1.price = 22222;

        boolean result = obj.equals(obj1);

        System.out.println(result);
      //   System.out.println(obj);    // System.out.println(obj.toString());  in background this is running
        /*
        output of System.out.println(obj);
        is:
awantikachauhan@Awantikas-MacBook-Air java_core % java objectClass
Laptop@7ad041f3

everytime we call obj; it calls a method "toString" which is a method of OBJECT class
return getClass().getName() + "@" + Integer.toHexString((hashCode));

there is another method of superclass OBJECT, i.e., "equals" which compares the boolean value based on hexadecimal codes
we can override that method as well in the subclass
         */
    }
}