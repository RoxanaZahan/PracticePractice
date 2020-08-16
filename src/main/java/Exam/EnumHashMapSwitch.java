package Exam;

import java.util.HashMap;
import java.util.Map;

public class EnumHashMapSwitch {
    public static void main(String[] args) {

        HashMap<String, Integer> myMap = new HashMap<>();
        myMap.put("January", 30);
        myMap.put("February", 29);

        for(Map.Entry<String, Integer> entry : myMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue()); //get key and value
        }

        System.out.println(myMap.values()); //get values
        System.out.println(myMap.keySet()); //get keys
        System.out.println(myMap.get("January")); //get value based on key

        Days day = Days.Tuesday;
        switch (day) {
            case Monday:
                System.out.println(day + " is day " + day.getDayNumber());
                break;
            case Tuesday:
                System.out.println(day + " is day " + day.getDayNumber());
                break;
            case Wednesday:
                System.out.println(day + " is day " + day.getDayNumber());
                break;
        }

        // From enum take values and add them to an already predefined array based on the number of enum values
        System.out.println("Enum Array start: ");
        for(Days dayW : getDaysEnumArray()) {
            System.out.println(dayW);
        }



    }

    public static Days[] getDaysEnumArray() {
        int counter = 0;
        for(Days day : Days.values()) {
            counter++;
        }
        Days[] array = new Days[counter];
        int index = 0;
        for(Days day : Days.values()) {
            array[index] = day;
            index++;
        }
        return array;
    }

    enum Days {
        Monday(1),
        Tuesday(2),
        Wednesday(3);

        int dayNumber;

        Days(int dayNumber) {
            this.dayNumber = dayNumber;
        }

        public int getDayNumber() {
            return this.dayNumber;
        }


    }


}
