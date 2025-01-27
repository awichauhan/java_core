class Calculator
{
   public int add(int n1, int n2)      // to increase/decrease the number of variables to be added
   {
       int result = n1 + n2;
       return result;                 // to simplify and avoid using extra variable (result), we can use < return n1 + n2; >
   }
   public int add(int n1, int n2, int n3)    // method with same name but different number(2 or 3)/types(double or float) of variables: known as method overloading
   {
       return n1+ n2 + n3;
   }
}

public class method_overloading
{
    public static void main (String a[]){
        Calculator obj = new Calculator();
        int r1 = obj.add(3,4,5);
        System.out.println(r1);
    }
}