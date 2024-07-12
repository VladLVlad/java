package lesson6.practice;

public class ArrayStringDemo {
    public static void main(String[] args) {
        String[] daysOfTheWeeks = new String[7];
        daysOfTheWeeks[0] = "Monday";
        daysOfTheWeeks[1] = "Tuesday";
        daysOfTheWeeks[2] = "Wednesday";
        daysOfTheWeeks[3] = "Thursday";
        daysOfTheWeeks[4] = "Friday";
        daysOfTheWeeks[5] = "Saturday";
        daysOfTheWeeks[6] = "Sunday";

        System.out.println(daysOfTheWeeks[daysOfTheWeeks.length-1]);
    }
}
