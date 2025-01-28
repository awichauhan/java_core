class A
{
    public A(){
        System.out.println("object created");
    }

    public void show(){
        System.out.println("show");
    }
}

public class anonymous_object{
    public static void main(String a[]){
        // A obj = new A();  here obj is a reference variable; we are declaring reference variable and initializing together
        // instead lets see below
        new A();     // this part is object creation (ANONYMOUS OBJECT)
        /*
        OUTPUT WOULD BE: object created  (STATEMENT PRINT DEFINED UNDER CONSTRUCTOR
         */
        new A().show(); // cant reuse this object as it will create the object again
        /*
        OUTPUT WOULD BE:
object created
object created
show
         */
    }
}

