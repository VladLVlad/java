package lesson19.examples.example8;

import java.util.Comparator;

public class PhoneComparator implements Comparator<Phone> {
    @Override
    public int compare(Phone o1, Phone o2) {
        int result = o1.getModel().compareTo(o2.getModel());
        if(result != 0){
            return result;
        }else {
            int result2 = o1.getVersion().compareTo(o2.getVersion());
            if (result2 != 0){
                return result2;
            }else{
                return Double.compare(o1.getCost(),o2.getCost());
            }
        }
    }
}
