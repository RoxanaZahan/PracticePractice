package Exam;

public class PrimitivesDataTypesLoops {
    public static void main(String[] args) {
        boolean isTrue = true;
        boolean isFalse = false;
        System.out.println(!isTrue); //returns false
        System.out.println(isTrue&&isFalse); //returns false
        System.out.println(isTrue||isFalse); //returns true

        byte myByte = 2;
        short myShort = 40;
        int myInt = 54;
        long myLong = 3456L;
        float myFloat = 65.78f;
        double myDouble = 34.3467;

        long a = myInt+myLong;
        int b = (int)myDouble + myInt;
        double c = (myDouble / myLong) * myByte;

        char d = 'G';

        char[] charArray = {'a','b','.','c','d'};

        for(int i = 0; i < charArray.length; i++) {
            System.out.println(charArray[i]);
        }

        for(char i : charArray) {
            System.out.println(i);
        }

        int counter = 0;
        while(counter<charArray.length) {
            System.out.println(charArray[counter]);
            counter++;
        }

        int counter2 = 0;
        do {
            System.out.println(charArray[counter2]);
            counter2++;
        } while(counter2<0);

    }

}
