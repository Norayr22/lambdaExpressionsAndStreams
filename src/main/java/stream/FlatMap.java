package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FlatMap {

    public static void main(String[] args) {

        List<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);

        List<Integer> b = new ArrayList<>();
        b.add(4);
        b.add(5);
        b.add(5);

        List<Integer> c = new ArrayList<>();
        c.add(7);
        c.add(8);
        c.add(9);

        List<List<Integer>> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        list.add(c);

//        list.stream()
//                .forEach(l-> System.out.println(l));

        Stream<Integer> integerStream = list.stream()                                              //flatMap
                                       .flatMap(l -> l.stream());

        integerStream.distinct().forEach(e-> System.out.println(e));
    }
}
