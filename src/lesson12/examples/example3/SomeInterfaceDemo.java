package lesson12.examples.example3;

public class SomeInterfaceDemo {
    public static void main(String[] args) {
        SomeInterface[] someInterfaces = {
                new SomeInterfaceContinue2(),
                new SomeInterfaceContinue1()
        };

        for (SomeInterface s:
             someInterfaces) {
            s.print();
        }
    }
}
