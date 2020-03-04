package stream;

import java.util.ArrayList;
import java.util.List;

public class AnyMatchNoneMatch {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("ball");
        list.add("apple");
        list.add("cat");
        list.add("dog");

//        System.out.println(
//                list.stream()
//                        .filter(s->s.length()>3)
//                        .anyMatch(s -> s.contains("a"))
//        );

        System.out.println(
                list.stream()
                        .filter(s->s.length()>3)
                        .anyMatch(s -> !s.contains("e"))
        );
    }
}
