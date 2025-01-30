class A
{
    public void show(){             //method overriding
        System.out.println("in show");
    }
    public void config(){
        System.out.println("in A config");
    }
    public int add(int a, int b){
        return a + b;
    }
}

class B extends A{
    public void show(){                 // using same name of method in super class
        System.out.println("In B show");
    }

    public int add(int a, int b){           // method overriding
        return a + b + 1;
    }
}

public class methodOverriding{
    public static void main(String a[]){
        B obj = new B();
        obj.show(); // because we have created object of B class; its own method is being preferred rather than the superclass's
        obj.config();
        int sum = obj.add(3,6);
        System.out.println(sum);
    }
}