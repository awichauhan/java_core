/*
FINAL keyword for VARIABLE, METHOD, CLASS
to declare the constants
 */
class G {                         // if we make it final; cant be extended
    final public void show(){             // making method as final that no object can override it
        System.out.println("in G");
    }
    public int add(int a, int b){
        return a + b;
    }
}

class H extends G {

}
public class finalKeyword
{
    public static void main(String a[]){
        final int num = 9;   // constant variable
        num = 8;  // cant change value of num
    }
}