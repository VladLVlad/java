package lesson5.practice;

public class DayWeek2 {
    public static void main(String[] args) {
        String str;
        str = switch (Integer.parseInt(args[0])){
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6, 7 -> "Weekend";
            default -> "It isn't a day of the week";
        };
        System.out.println(str);
    }
}
