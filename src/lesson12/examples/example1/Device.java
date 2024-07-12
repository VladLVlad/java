package lesson12.examples.example1;

public abstract class Device implements Movable{

    @Override
    public void moveLeft() {
        System.out.println("Device turn left");
    }
}
