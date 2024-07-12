package lesson9.examples.box;

public class BoxDemo {
    public static void main(String[] args) {
        Box box1 = new Box("Box1", 12.2, 10, 5.1, 2.2, "green");
        Box box1_2 = box1.returnObject();
        Box box2 = new Box("Box2", 11.4, 9, 4.5, 1.9);
        Box box3 = new Box(2.2);

        box1.getVolumeAndWeight();
        box1.getColor();
        box1_2.getVolumeAndWeight();
        box1_2.getColor();
        box2.getVolumeAndWeight();
        box2.getColor();
        box3.getVolumeAndWeight('a');
        box3.getColor();
    }
}
