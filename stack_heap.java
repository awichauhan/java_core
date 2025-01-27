class Calculator
{
    int num = 5;                       // instance variable; declaration inside CLASS

    public int add(int n1, int n2)     // local variables for add method (new stack); declaration inside METHOD
    {
        System.out.println(num);       // using instance variable; not declaring
        int result = n1 + n2;
        return result;
    }
}

public class stack_heap
{
    public static void main (String a[]){
        int data = 10;                           // local variable; storing in stack (data = 10); key-value pair
        Calculator obj = new Calculator();// instantiation of class i.e., a new object created
        /* new object (obj) is created inside heap memory and stack is storing the address of heap memory where the
        value of obj is stored (containing its variables and methods);
        Linking stack and heap: obj variable is created in stack but its values (variable and methods) are saved under heap */
        Calculator obj1 = new Calculator(); // new object of same class
        int r1 = obj.add(3,4);               // replace it with obj.num = 8; to recreate issue
        System.out.println(obj.num);
        System.out.println(obj1.num);
    }
}