package Exam;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Collections {

    //create lists of ints, strings, chars and objects
    //same as above but use arrays

    // loop over them with all loops
    // extract first / mid / last values from all using inbuilt and math
    // on same lists add first and last / remove first and last
    // create array out of list
    // create list out of array
    // add indexes in lists and arrays using foreach and whiles - based on indexes, extract 1 or 2 values

    // create methods that accepts list as param - fuse 2 of these methods with 2 different lists ( a 2-a lista in coada primei liste )
    // also familiarize with linked list
    // also create Sets and find out what they do

    // Learn the iterator - apply iterator on arrays and lists.

    // From enum take values and add them to an already predefined array based on the number of enum values



    public static void main(String[] args) {
        int[] myIntArray = {1,2,3,4,5,6,7,8,9};
        String[] myStringArray = new String[6];
        myStringArray[0] = "asd";
        myStringArray[1] = "hej";
        myStringArray[5] = "rgh";
        char[] myCharArray = {'a','b','c'};
        Fruit[] myFruitsArray = new Fruit[3];
        Fruit apple = new Fruit("apple", "green");
        Fruit banana = new Fruit("banana", "yellow");
        Fruit pear = new Fruit("pear", "yellow");
        myFruitsArray[0] = apple;
        myFruitsArray[1] = banana;
        myFruitsArray[2] = pear;

        //Lists
        ArrayList<Integer> myIntList = new ArrayList<>();
        for(int i = 0; i<myIntArray.length; i++) {
            myIntList.add(myIntArray[i]);
        }
        ArrayList<String> myStringList = new ArrayList<>();
        for(String s : myStringArray) {
            myStringList.add(s);
        }
        ArrayList<Character> myCharList = new ArrayList<>();
        int index = 0;
        while (index<myCharArray.length) {
            myCharList.add(myCharArray[index]);
            index++;
        }
        ArrayList<Fruit> myFruitsList = new ArrayList<>();
        int index2 = 0;
        do{
            myFruitsList.add(myFruitsArray[index2]);
            index2++;
        } while(index2<myFruitsArray.length);


        // extract first / mid / last values from all using inbuilt and math
        //System.out.println(myCharArray[0] + " " + myCharArray[myCharArray.length-1] + " " + myCharArray[myCharArray.length/2]);
        //System.out.println(myStringList.get(0) + " " + myStringList.get(myStringList.size()-1) + " " + myStringList.get(myStringList.size()/2));

        // on same lists add first and last / remove first and last
        myIntArray[0] = 0;
        myIntArray[myIntArray.length-1] = 0;
        int[] myNewIntArray = new int[myIntArray.length-2];
        int in = 0;
        for(int i = 1; i<myIntArray.length-1; i++) {
            myNewIntArray[in] = myIntArray[i];
            in++;
        }
        for(int i : myNewIntArray) {
            //System.out.println(i);
        }

        myIntList.remove(0);
        myIntList.remove(myIntList.size()-1);
        //System.out.println(myIntList);

        ArrayList<Integer> newIntegerList = new ArrayList<>();
        newIntegerList.add(9);
        newIntegerList.add(0);
        fuseLists(newIntegerList,myIntList);

        //use Iterator
        Iterator<Integer> it = newIntegerList.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        //linkedLists
        LinkedList<String> myLinkedList = new LinkedList<>();
        myLinkedList.add("dshd");
        myLinkedList.add("efuhc");
        myLinkedList.remove(0);



    }

    // create methods that accepts list as param - fuse 2 of these methods with 2 different lists ( a 2-a lista in coada primei liste )
//    public static ArrayList<Integer> getlist1 (ArrayList<Integer> list) {
//        return list;
//    }
//
//    public static ArrayList<Integer> getlist2 (ArrayList<Integer> list) {
//        return list;
//    }

    public static void fuseLists (ArrayList<Integer> list1, ArrayList<Integer> list2) {
        list1.addAll(list1.size(), list2);
    }
}
