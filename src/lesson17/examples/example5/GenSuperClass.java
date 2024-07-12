package lesson17.examples.example5;

public class GenSuperClass <T>{
    private T value;

    public GenSuperClass(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

}

class  NotGenClass <W> extends GenSuperClass<Double>{

    private W name;

    public NotGenClass(Double value, W name) {
        super(value);
        this.name = name;
    }

    public W getName() {
        return name;
    }

    public void setName(W name) {
        this.name = name;
    }

    public static void main(String[] args) {
        NotGenClass<String> notGen = new NotGenClass<>(4.5, "Name1");
        System.out.println(notGen.getName() + " " + notGen.getValue());
    }
}

