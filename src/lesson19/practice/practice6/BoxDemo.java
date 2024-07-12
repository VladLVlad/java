package lesson19.practice.practice6;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class BoxDemo {
    public static void main(String[] args) {
        List<Box> list = new LinkedList<>(List.of(
                new Box(50,1,1),
                new Box(30,1,1),
                new Box(10,1,1),
                new Box(20,1,1),
                new Box(40,1,1)
        ));
        List<Box> newList = doNewCollection(list);
        newList.forEach(System.out::println);
        System.out.println();
        list.forEach(System.out::println);
    }
    public static LinkedList<Box> doNewCollection(List<Box> list){
        LinkedList<Box> newList = new LinkedList<>();
        Iterator<Box> iterator = list.iterator();
        while (iterator.hasNext()){
            Box box = iterator.next();
            if(box.getWidth() > 30){
                newList.add(box);
                iterator.remove();
            }
        }

        return newList;
    }
}
