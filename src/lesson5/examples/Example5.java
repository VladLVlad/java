package lesson5.examples;

public class Example5 {
    public static void main(String[] args) {
        int x = 100;

        first:
        {
            while (x > 0){
                System.out.println(x--);
                second:
                {
                    char s = 'A';
                    for (int i = 0; true; i++){
                        System.out.println(s++);
                        if (s == 'C'){
                            break second;
                        }
                    }

                }
                if (x == 97){
                    break first;
                }




            }
        }
    }
}
