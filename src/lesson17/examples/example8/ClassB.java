package lesson17.examples.example8;

public class ClassB {
    public static void main(String[] args) {
        ClassA a = new ClassA(){

            public String secondMethod(){
                return "Hello from the second method";
            }
            @Override
            public void someMethod() {
                super.someMethod();
                System.out.println(secondMethod());
            }


        };

        a.someMethod();
    }
}
