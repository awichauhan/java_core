/*
assigning value of one primitive data type to another
UPCASTING (WIDENING): happens automatically; converting smaller type to larger type
byte > short > char> int > long > float > double
DOWNCASTING (NARROWING): manually; converting larger type to smaller
double > float > long > int > char > short > byte
 */

import java.sql.SQLSyntaxErrorException;

/*
upcasting:
int myInt = 9;
double myDoubleInt = myInt;    (automatic)

downcasting:
double myDouble = 9.7f;
int myInt = (int) myDouble;   (manually)
*/
class typeA{
    public void show(){
        System.out.println("in typeA");
    }
}

class typeB extends typeA {
    public void show1(){
        System.out.println("in typeB");
    }
}

public class typeCasting{
    public static void main(String a[]){
        int obtainedMarks = 93;
        float totalMarks = 100;
        float marksObtained = obtainedMarks/totalMarks * 100;     //upcasting data type
        System.out.println(marksObtained);

        typeA obj1 = new typeB();     //typecasting (upcasting); casting subclass with superclass
        obj1.show();

        typeB obj = (typeB) new typeA();   // downcasting
        obj.show();
    }
}

/* output giving exception:
Exception in thread "main" java.lang.ClassCastException: class typeA cannot be cast to class typeB (typeA and typeB are in unnamed module of loader 'app')
        at typeCasting.main(typeCasting.java:42)
 */
