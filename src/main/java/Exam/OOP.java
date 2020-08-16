package Exam;

public class OOP {

    // Debug + Evaluate expression  Step into, Step over
    // Classes with constructors ( what's a constructor ) constructor with and without arguments
    // Objects - create objects out of classes, Also look into the Object class from Java.
    // LEARN ABOUT COMPOSITION ( WHATEVER THE FUCK THAT IS )
    // Inheritance - extends on ... every type of class ( Normal, abstract - Why not Interfaces ? )
    // Override/Overload - with clear examples
    // Polymorphism - Reference variable Parent parent = new Parent(); - with default and custom constructors
    // Abstractization - with clear examples on abstract methods and full body methods
    // Interfaces - with clear example ( and more complicated one e.g. class implements interface and can extend ? )
    // e.g. 2 - Class 1 implements class 2 , class 3 extends class 1 ( is class 1 required to implement class 2 interface ? )
    // Encapsulation ( learn all the access modifiers, pr,pub,pro,default ) - how do they work REAL EXAMPLES

        // Learn the STATIC. --- and what does psvm mean and what does it represent
    //public = face metoda vizibila de oriunde
    //static = metoda poate sa fie apelata fara initializarea clasei si nu ocupa loc in memorie
    //void = metoda nu returneza nimic
    //main = numele metodei care e cautata si apelata de JVM
    //String[] args = array-ul de stringuri care contine argumentele apelate de JVM
    //prin metoda de psvm se incepe executia codului

    public static void main(String[] args) {

        // Operatii pe stringuri trim, substring, toChar, concat,charAt, split
//        String string = " I will pass this exam. ";
//        String string2 = "Hope so.";
//        System.out.println(string.trim());
//        System.out.println(string.substring(4,7));
//        System.out.println(string.charAt(4));
//        System.out.println(string.concat(string2));
//        String[] splitedString = string.split(" ");
//        for(String s : splitedString) {
//            System.out.println(s);
//        }

        // Try catch finally - 4/5 exceptions learned - Create actual example ( of null pointer of array out of bound ) test including finally
//        int[] intArray = {1,2,3,4};
//        try {
//            System.out.println(intArray[intArray.length]);
//        } catch(IndexOutOfBoundsException ex) {
//            System.out.println("Exception caught");
//        } finally {
//            System.out.println("I want to print last item");
//        }
//
//        ArrayList<String> stringList = null;
//        try {
//            System.out.println(stringList.size());
//        } catch(NullPointerException ex) {
//            System.out.println("Exception caught. There is nothing to print since the obj is null");
//        } finally {
//            System.out.println("I want to print an obj");
//        }

        // Also throw new Exception

        // Create Object variable and then transform it to another primitive type e.g. ( Object object ... )
        Object object = new Object();
        object = 5;

    }






}
