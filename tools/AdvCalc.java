package tools;

public class AdvCalc extends Calc {    // another class requiring the features of base class; so extend (inheritance)
        public int mult(int n1, int n2){
            return n1*n2;
        }
        public int div(int n1, int n2){
            return n1/n2;
        }
}

// this sub class is being called in inheritance.java code
