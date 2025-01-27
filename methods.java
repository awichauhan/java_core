class Computer                              // new class
{
    public void playMusic()               // public: can be accessed from anywhere; void: no return type of this method
    {
        System.out.println("music playing");
    }
    public String getPen(int cost)       // another method; but to call this method, we need to pass a int value to it
    {
        if (cost >= 10)
            return "Pen";
        else
            return "Nothing";
    }
}
public class methods {
    public static void main(String a[]){
        Computer obj = new Computer();    // obj= reference variable
        obj.playMusic();
        String pen = obj.getPen(8);
        System.out.println(pen);
    }
}


