package lesson12.examples.example7;

public enum SizeClothes implements Runnable {
    XS{
        @Override
        public String showSize() {
            return "Small";
        }
    }, S(42), M(44), L(46), XL(48), XXL(50){
        @Override
        public String showSize() {
            return "Big";
        }
    };

    private int size;

    SizeClothes() {
        this.size = 40;
    }

    SizeClothes(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String showSize(){
        return "Norm";
    }


    @Override
    public void run() {
        System.out.println("run");
    }
}
