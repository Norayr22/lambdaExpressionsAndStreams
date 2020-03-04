package lambda;

import functionalInterfaces.GreetingService;

public class HigherOrderFunction {

    public static void main(String[] args) {
        GreetingService g1 = n->n.toUpperCase();
        GreetingService g2 = n->n.toLowerCase();
        GreetingService g3 = n->n.length()+"";

//        test(g1);

        test(g1);  //function as a parameter
        test(a->a.substring(1,3));

        String data = getLambda().greet("data");
        System.out.println(data);

    }
//
    private static void test(GreetingService g){
        String returnedString = g.greet("sfl");
        System.out.println(returnedString);
    }
//
    private static GreetingService getLambda(){ //returning lambda
        return s->s.toUpperCase();
    }
}
