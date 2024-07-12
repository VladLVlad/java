package lesson9.practice.practice8;

public class Vet {
   public void treatAnimal(Animal animal){
       System.out.println(animal.getName() + ":");
       System.out.println(animal.getDescription());
       System.out.println("eat: " + animal.eat());
       System.out.println("say: " + animal.makeNoise());
   }
}
