class Hello
 {
     public static void main(String a[])
     {
         System.out.println("Hello world");
     }
 }

 /*  JVM makes java platform independent (you can run on any machine; it only requires JVM
 JVM is machine dependent */

 // JVM understands byte code and we write Java code and JavaC converts java code to byte code

 /* JVM will execute one main file. that file should have main(). execution starts from main method as JVM looks for specific signature;
 that signature is <public static void main (String arg[])> */

 // we need to have a class for code to run

 // extension for byte code file is .class; Hello file created automatically
 // to run the code on JVM; we need to run command: java <classname>
 // to compile the code; command: javac <javafilename>

 // JVM: java virtual machine; part of JRE;
 // JRE: java runtime environment; includes libraries and JVM

 /* Java is called as WORA; Write once run anywhere: because it does not require JDK to be installed on every system.
 machines do have JRE and JVM installed by default */



