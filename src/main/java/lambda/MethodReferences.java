package lambda;

import functionalInterfaces.StringOperations;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MethodReferences {

    private static final List<String> list = new ArrayList<>();

    public static void main(String[] args) {
//        StringOperations op1 = System.out::println;//should be single line lambda for using method reference
//
//        StringOperations op2 = System.out::println; //whatever data I have call simply giving it to another method

        StringOperations op3 = Objects::isNull;
//        StringOperations op4 = s->Objects.isNull(s);

//        StringOperations op4 = String::toUpperCase; //s->s.toUpperCase()

//        StringOperations op5 = String::concat;// (s1,s2)->s1.concat(s2)


//          StringOperations op6 = list::add; //s->list.add(s)

//        op1.accept("welcome");
//        op2.accept("welcome");
        System.out.println(op3.accept(""));
//        System.out.println(op4.accept("welcome"));
//        System.out.println(op5.accept("ab","cd"));
//          op6.accept("sfl");
//          System.out.println(list);
    }
}
