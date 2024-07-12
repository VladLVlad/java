package lesson12.practice.practice2;

public enum Season {
    WINTER(-10), SPRING(15), SUMMER(23){
        @Override
        public String getDescription() {
           return "warm";
        }
    }, AUTUMN(10);

    private int averageTemperature;

    Season() {
    }

    Season(int averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    public int getAverageTemperature() {
        return averageTemperature;
    }

    public void setAverageTemperature(int averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    public String getDescription(){
        return "cold";
    }
}
