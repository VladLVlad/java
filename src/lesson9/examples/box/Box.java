package lesson9.examples.box;

public class Box {
    private String name;
    private double weight;
    private double height;
    private double width;
    private double depth;

    private String color;

    Box() {
        this.name = "?";
        this.color = "?";
    }

    Box(double equal) {
        this.weight = equal;
        this.height = equal;
        this.width = equal;
        this.depth = equal;
    }

    Box(String name, double weight, double height, double width, double depth) {
        this();
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    Box(String name, double weight, double height, double width, double depth, String color) {
        this(name, weight, height, width, depth);
        this.color = color;
    }
    /*Box(String n, double we, double h, double w, double d){
        name = n;
        weight = we;
        height = h;
        width = w;
        depth = d;
    }*/



    /*public void setBox(String n, double we, double h, double w, double d){
        name = n;
        weight = we;
        height = h;
        width = w;
        depth = d;
    }*/

    public void getVolumeAndWeight() {
        System.out.println(name + " weights " + weight + " and box volume is " + (height * width * depth));

    }

    public void getVolumeAndWeight(char symbol) {
        System.out.println(name + " weights " + weight + " and box volume is " + (height * width * depth) + ", symbol is " + symbol);

    }

    public void getColor() {
        System.out.println(name + " has " + color + " color");
    }

    public Box returnObject(){
        return new Box(this.name + "_2", this.weight*2, this.height*2,this.width,this.depth, "red");
    }

}
