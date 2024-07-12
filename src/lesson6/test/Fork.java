package lesson6.test;

class Fork {
    public static void main(String[] args) {
        float a = 1.1f;
        long b = 22l;
        if (a == b){
            System.out.println("111");
        }
        if (args.length == 1 | args[1].equals("test")) {
            System.out.println("test case");
        } else {
            System.out.println("production " + args[0]);
        }
    }
}
