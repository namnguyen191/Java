package B;

import java.util.Comparator;

public class ShapeComparator implements Comparator<Shape> {

    @Override
    public int compare(Shape t, Shape t1) {
        return t.compareTo(t1);
    }
    
    public boolean equals(Shape s1, Shape s2){
        return s1.compareTo(s2)==0?true:false;
    }
    
}
