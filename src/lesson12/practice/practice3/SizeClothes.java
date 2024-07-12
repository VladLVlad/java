package lesson12.practice.practice3;

public enum SizeClothes {
    XXS(32){
        @Override
        public String getDescription(){
            return "child size";
        }
    }, XS(34), S(36), M(38), L(40);

    private int euroSize;

    SizeClothes() {
    }

    SizeClothes(int euroSize) {
        this.euroSize = euroSize;
    }

    public int getEuroSize() {
        return euroSize;
    }

    public void setEuroSize(int euroSize) {
        this.euroSize = euroSize;
    }

    public String getDescription(){
        return "adult size";
    }
}
