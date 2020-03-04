package lambda;

import java.util.function.Function;

public class FunctionFunctionalInterface {

    public static void main(String[] args) {
//        Function<String, Integer> strLength = s->s.length();
//        Function<Integer, Integer> square = i->i*i;

//        System.out.println(
//                strLength.apply("hi hello how are you")
//        );
//
//        System.out.println(
//                //20               //400
//                strLength.andThen(square).apply("hi hello how are you")
//        );
        //-----------------------------------------------------------------//

        Function<Integer, Integer> plus2 = i->i+2;
        Function<Integer, Integer> square = i->i*i;

//        System.out.println(
//                //10          //100
//               plus2.andThen(square).apply(8)
//        );

        System.out.println(

                plus2.compose(square).apply(8)
        );       //66             //64
    }

    //andThen a.andThen(b) ==> a->b
    //compose a.compose(b) ==> b->a
    //The return types should be the same when you are using andThen or compose
}
