package lesson17.examples.example7;

public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator<Double, Short> calculator = new Calculator<>(2.5, (short)7);
        calculator.calculate();
        Calculator<Float,Integer> calculator2 = new Calculator<>(5.4f,32){
            @Override
            public void calculate(){
                class Umn {
                    public void umnCalculate(){
                        System.out.println("Umn: " + (getT().doubleValue() * getU().doubleValue()));
                    }
                }
                Umn umn = new Umn();
                umn.umnCalculate();
                System.out.println("Del :" + (getT().doubleValue() / getU().doubleValue()));
            }
        };
        calculator2.calculate();
    }
}
