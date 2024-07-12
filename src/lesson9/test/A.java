package lesson9.test;

public class A {
    public void print(){
        System.out.println("1");
    }

    public void print(int a){
        System.out.println(a);
    }
}

class B extends A{

    @Override
    public void print() {
        super.print();
    }
}
