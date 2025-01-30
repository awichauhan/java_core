class D
{
    public void show(){
        System.out.println("In D");
    }
}

class E extends D
{
    public void show(){
        System.out.println("In E");
    }
}
class F extends D {
    public void show(){
        System.out.println("in F");
    }
}
public class dynamicMethodDispatch{
    public static void main(String a[]){
        D obj1 = new D();
        // D obj1 = new E(); obj type is D(parent class) but implementation(object) is E (child class)
        // reference of parent class but object of child class
        obj1.show();

        obj1 = new E();
        obj1.show();

        obj1 = new F();
        obj1.show();

        /* same object obj1 is behaving differently during runtime; known as dynamic method dispatch
it doesnt matter what type of object is created ; it all depends on what object you have
D obj1 = new E();; here type of object is D (reference variable is of D) but object is created of E class

this is possible only because of inheritance happening between the classes.
         */
    }
}