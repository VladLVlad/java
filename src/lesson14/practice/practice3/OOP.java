package lesson14.practice.practice3;

public class OOP {
    public static void main(String[] args) {

        String text2 = "HelLo, my friend. hello, my brother. HEllo, my sister. HellO,Hello!";
        StringBuilder str = changeEachTwo(new StringBuilder(text2), "Hello", "Hi");
        System.out.println(str);
    }

    public static StringBuilder changeEachTwo(StringBuilder str, String changes, String newChanges) {
        String newStr = str.toString();
        String lowerNewStr = newStr.toLowerCase();
        String lowerChanges = changes.toLowerCase();
        int indexStart = 0;
        int index;
        boolean flag = false;
        while ((index = lowerNewStr.indexOf(lowerChanges, indexStart)) != -1){
            if(flag){
                str.replace(index, index + changes.length(), newChanges);
                indexStart = index + newChanges.length();
            }else {
                str.replace(index, index + changes.length(), changes);
                indexStart = index + changes.length();
            }
            lowerNewStr = str.toString().toLowerCase();
            flag = !flag;


        }
        return str;
    }
}
