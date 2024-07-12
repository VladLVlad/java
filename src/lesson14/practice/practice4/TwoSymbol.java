package lesson14.practice.practice4;

public class TwoSymbol {
    public static void main(String[] args) {
        findTwoAverageSymbols("Hello11");
        findTwoAverageSymbols("Friend22");
    }
    public static void findTwoAverageSymbols(String str){
        if(str.length() % 2 == 0){
            System.out.println(str.charAt(str.length()/2 - 1) + "" + str.charAt(str.length()/2));
        }else {
            System.out.println(str.charAt(str.length()/2));
        }
    }
}
