package lesson19.practice.practice3;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueNumbers {
    public static void main(String[] args) {

        String input = "1, 1, 2, 3, 4, 4, 5";


        String[] numbersArray = input.split(",\\s*");
        System.out.println(numbersArray[0]);

        Set<String> uniqueNumbersSet = new LinkedHashSet<>(Arrays.asList(numbersArray));


        String result = String.join(", ", uniqueNumbersSet);


        System.out.println(result);
    }
}
