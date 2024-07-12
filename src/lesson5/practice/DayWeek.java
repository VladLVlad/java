package lesson5.practice;

public class DayWeek {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);

        if(number == 1){
            System.out.println(args[0] + " " + "Monday");
        } else if(number == 2){
            System.out.println(args[0] + " " + "Tuesday");
        } else if(number == 3){
            System.out.println(args[0] + " " + "Wednesday");
        } else if(number == 4){
            System.out.println(args[0] + " " + "Thursday");
        } else if(number == 5){
            System.out.println(args[0] + " " + "Friday");
        } else if(number == 6 || number == 7){
            System.out.println(args[0] + " " + "Weekend");
        } else System.out.println("It isn't a day of the week");
    }
}
