import tools.veryAdvCalc;

public class inheritance{
    public static void main (String a[]){
       // tools.AdvCalc obj1= new tools.AdvCalc(); // using derived class (tools.AdvCalc) which has the base features from base class (tools.Calc)
        veryAdvCalc obj1 = new veryAdvCalc();   // multilevel inheritance
        int r1 = obj1.add(4,5);    //base class method i.e., from tools.Calc class
        int r2 = obj1.sub(3,2);
        int r3 = obj1.div(9,3); // derived class method i.e., from tools.AdvCalc class
        double r4 = obj1.power(2,3);
        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4);
    }
}


/* extends: IS relationship
example: Fortuner (derived class) is a car (base class)
super class - sub class
base class - derived class
Parent class - child class
 */

/*
C has A and B both as parent class; it will not work in java
public class C extends A,B  (not working)

AMBIGUITY ISSUE: if a method exists in both A and B, then which one will be chosen by C (if it calls that method)

JAVA DOES NOT SUPPORT MULTIPLE INHERITANCE
 */


