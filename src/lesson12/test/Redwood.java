package lesson12.test;

public class Redwood extends Tree1 {
    public static void main(String[] args) {
        new Redwood().go();
    }

    void go() {
        go2(new Tree1(), new Redwood());//1
        go2((Redwood) new Tree1(), new Redwood());//2
    }

    void go2(Tree1 t1, Redwood r1) {
        Redwood r2 = (Redwood) t1;//3
        Tree1 t2 = (Tree1) r1; //4
    }
}

class Tree1 {
}
