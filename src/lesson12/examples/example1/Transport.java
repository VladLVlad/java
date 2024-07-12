package lesson12.examples.example1;

public class Transport implements Movable, Submersible{


    @Override
    public void moveRight() {
        System.out.println("Turn right");
    }

    @Override
    public void moveLeft() {
        System.out.println("Turn left");
    }

    @Override
    public void loadingPassengers(int n) {
        System.out.println("Loading Passengers" + n);
    }

    public void stop(){
        System.out.println("Stop");
    }

    public void start(){
        System.out.println("Start");
    }
}
