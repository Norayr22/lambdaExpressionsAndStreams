package stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MinANDMax {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("ball");
        list.add("apple");
        list.add("cat");
        list.add("dog");


//        System.out.println(
//                list.stream()
//                .max(Comparator.reverseOrder())
//                .get()
//        );

//        System.out.println(
//                list.stream()
//                        .max(Comparator.reverseOrder())
//                        .get()
//        );

        System.out.println(
                list.stream()
                        .filter(s->s.length() > 4)
                        .max(Comparator.naturalOrder())
                        .get()
        );
    }
}
