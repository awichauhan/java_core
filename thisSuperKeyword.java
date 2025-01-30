class X
{
    public X(){                   // default constructor of X class
        System.out.println("in X");
    }

    public X(int y){                  // parameterized constructor of X class
        System.out.println("in X INT");
    }
}

class Y extends X {
    public Y(){     // default constructor of Y class
        //super(5);                 // to call default constructor of Y but parameterized constructor of X, just passed a number like 5
        System.out.println("In Y");
    }

    public Y(int x){             // parameterized constructor
        this();                   // this keyword will call the constructor of same class (to call both constructors of subclass Y)
       // super(x);               //  super with x parameter will call only the parameterized constructor of super class
        System.out.println("in Y INT");
    }
}

public class this_super{
    public static void main(String a[]){
        Y obj = new Y(4);   //  to call the parameterized constructor of Y, pass any integer parameter
        /*
when passing parameters with object of Y; the output is:
awantikachauhan@Awantikas-MacBook-Air java_core % java this_super
in X
in Y INT
         */
    }
}

/* if we compile this code; constructor of both child and parent class will be called.
OUTPUT will be:
awantikachauhan@Awantikas-MacBook-Air java_core % java this_super
in X
In Y
 */

/* every constructor in java has a method (no need to add its code)
that method is super; which means is "call the constructor of super class"
example code:

 public X(){
        super();
        System.out.println("in X");
    }

 */

/*
this keyword will execute the constructor of same class
 */