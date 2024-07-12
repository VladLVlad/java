package lesson14.practice.practice3;

public class OOP2 {
    public static void main(String[] args) {

        String text2 = "HelLo, my friend. Hello, my brother. Hello, my sister. Hello,Hello!";
        StringBuilder str = changeEachTwo(new StringBuilder(text2), "Hello", "Hi");
        System.out.println(str);
    }

    public static StringBuilder changeEachTwo(StringBuilder str, String changes, String newChanges) {
        // ??????????? StringBuilder ? String ? ?????? ??? ???????? ?????
        String originalStr = str.toString();
        String lowerCaseStr = originalStr.toLowerCase();
        String lowerCaseChanges = changes.toLowerCase();

        int indexStart = 0;
        int index;
        boolean flag = false;
        StringBuilder result = new StringBuilder(originalStr);
        while ((index = lowerCaseStr.indexOf(lowerCaseChanges, indexStart)) != -1){
            if(flag){
                result.replace(index, index + changes.length(), newChanges);
                indexStart = index + newChanges.length();
                // ????????? lowerCaseStr, ????? ?? ?????????????? ???????? ????????? result
                lowerCaseStr = result.toString().toLowerCase();
            }else {
                indexStart = index + changes.length();
            }
            flag = !flag;
        }
        return result;
    }
}

