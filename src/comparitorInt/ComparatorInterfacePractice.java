package comparitorInt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorInterfacePractice {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        values.add(305);
        values.add(998);
        values.add(774);
        values.add(236);
        values.add(881);

//        Comparator<Integer> com = new CompImpl();

        Comparator<Integer> com = (o1, o2) -> {
            return o1%10>o2%10?1:-1;
        };

        Collections.sort(values, com);

        for ( int i : values) {
            System.out.println(i);

        }
    }
}
