package lesson12.examples.example7;

public class Clothes {
    private String view;
    private SizeClothes sizeClothes;

    public Clothes(String view, SizeClothes sizeClothes) {
        this.view = view;
        this.sizeClothes = sizeClothes;
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }

    public SizeClothes getSizeClothes() {
        return sizeClothes;
    }

    public void setSizeClothes(SizeClothes sizeClothes) {
        this.sizeClothes = sizeClothes;
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "view='" + view + '\'' +
                ", sizeClothes=" + sizeClothes +
                '}';
    }
}
