import tools.veryAdvCalc;
import tools.AdvCalc;
import tools.Calc;

public class packagesConcept{
    public static void main(String a[]){
        veryAdvCalc rr = new veryAdvCalc();
        double powervar = rr.power(2,3);
        System.out.println(powervar);
    }
}

// because I imported veryAdvCalc from tools packages; I had to import both parent classes (AdvCalc & Calc)

/*
to access methpds and variables outside packages, they should be public
ideally methods should be declared as public

private entity can be used within same class

pu
 */