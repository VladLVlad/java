package lesson12.examples.example6;

public class BoxDemo {
    public static void main(String[] args) {
        Box box = new Box(2.5, 1.3, 0.7);
        Box box2 = new HeavyBox(4,3,2,2);
        Box box3 = new ColorBox(3,2,1,"green");

        Box[] boxes = {box, box2,box3, new HeavyBox(5,3,1,4), new HeavyBox(4,3,2,2)};
        HeavyBox[] heavyBoxes = rightConversation(boxes);
        for (HeavyBox h:
             heavyBoxes) {
            System.out.println(h);
        }



        for (Box b:
             boxes) {
            if(b instanceof ColorBox colorBox){
                System.out.println(colorBox.getColor());
             }
        }

    }

    public static void rightConversation(){
        Box[] boxArray = new Box[5];
        boxArray = new HeavyBox[6];
    }

    public static HeavyBox[] rightConversation(Box[] boxes){
        HeavyBox[] heavyBoxes = {};
        for (Box b:
             boxes) {
            if(b instanceof HeavyBox heavyBox){
                HeavyBox[] newHeavyBoxes = new HeavyBox[heavyBoxes.length+1];
                System.arraycopy(heavyBoxes, 0, newHeavyBoxes, 0, heavyBoxes.length);
                newHeavyBoxes[newHeavyBoxes.length-1] =  heavyBox;
                heavyBoxes = newHeavyBoxes;
            }
        }
        return heavyBoxes;
    }
}
