/*
java is 99.9% Object oriented programming language
every class in java extends from OBJECT class
but the data types like int, char are primitive types which do not extend from any class; it makes java faster

to work with certain frameworks like "COLLECTION FRAMEWORK", we need to have objects and classes only
SO FOR EVERY PRIMITIVE TYPE,there is wrapper class.
 for int, INTEGER class; for char, CHARACTER class

 */

import java.sql.SQLSyntaxErrorException;

public class wrapperClass{
    public static void main(String a[]){
        int num = 7;
        // Integer num1 = new Integer(8);
        // Integer num1 = 8;                    // instead of above deprecated syntax
        // Integer num1 = new Integer(num);    // storing primitive type value in an object; known as BOXING
        Integer num1 = num;                 // AUTOBOXING
        // int num2 = num1.intValue();          // UNBOXING
        //int num2 = num1;                     //AUTO-UNBOXING

        System.out.println(num1);

        String str = "12";
        int num4 = Integer.parseInt(str);
        System.out.println(num4*2);
    }
}