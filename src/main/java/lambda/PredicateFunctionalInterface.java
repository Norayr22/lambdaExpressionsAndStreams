package lambda;

import java.util.function.Predicate;

public class PredicateFunctionalInterface {

    public static void main(String[] args) {
        Predicate<Integer> isGreat2 = n->n>2;
        Predicate<Integer> isLT10 = n->n<10;
        Predicate<Integer> isLT2 = n->n<2;

//        System.out.println(
//
//                isGreat2.test(1)
//
//        );
//
//        System.out.println(
//
//                isLT10.test(19)
//
//        );

//        System.out.println(
//
//                isLT2.or((isLT2).and(isGreat2)).test(1)
//
//        );

//        System.out.println(
//
//                isGreat2.negate().test(3)
//
//        );
    }
}
