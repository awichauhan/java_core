// String is a class in java; not a primitive type variable (starting from capital letter unlike char,int)

public class string_basics
{
    public static void main (String a[])
    {
        /*
        String name = "Awantika";
        // above code line will work as string is important for java devs; so this creates an object of class directly in backend
        // String name = new String(); typical way of creating object of class using constructor (created object with no value passed)
        // String name = new String("awantika"); // passed the string type value
        System.out.println("hello " + name); // concatenation
        System.out.println(name.charAt(2));  // printing the character at index 2 of the string
        System.out.println(name.concat(" chauhan"));  // concatenation using the methods/functions(concat) of Sting class
        */

        String name = "awantika";
        name = name + " chauhan";
        /* this appears like you are appending the string "awantika" by "awantika chauhan"
        but instead there is new object created (with new ref. address) in the heap for "awantika chauhan" and
        the object "awantika" is still existing in the heap with same ref. address (eligible for garbage out to save mem)
        However in the stack of main method, the value of variable (name) gets changed i.e., the reference address will
        get changed and it will have the reference address of new object that is created in heap
         */
        System.out.println("hello " + name);

        String s1 = "awi";
        String s2 = "awi";
        /* they are not 2 seperate objects; there is only single object in heap and 2 local variables (s1,s2) of this main method
        are pointing to same reference address
         */
        System.out.println(s1 == s2);   // whether s1 and s2 are having same reference addresses and it give output as true
    }
}

/* in the heap memory there is special area i.e., STRING CONSTANT POOL
every string created in java is constant (literal) and you cant change/update it (append) once created (you can delete)

by default, strings are immutable
to make strings as mutable, you can use 2 different classes i.e., StringBuilder or StringBuffer
 */

