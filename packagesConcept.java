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