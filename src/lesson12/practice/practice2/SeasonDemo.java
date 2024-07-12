package lesson12.practice.practice2;

public class SeasonDemo {
    public static void main(String[] args) {
        Season favouriteSeason = Season.SUMMER;

        switch (favouriteSeason){
            case SUMMER -> System.out.println("I like summer");
            case WINTER -> System.out.println("I like winter");
            case AUTUMN -> System.out.println("I like autumn");
            case SPRING -> System.out.println("I like spring");
        }

        Season[] seasons = Season.values();

        for (Season s:
             seasons) {
            System.out.println(s + " " + s.getAverageTemperature() + " " + s.getDescription());
        }


    }
}
