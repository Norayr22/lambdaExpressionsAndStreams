package lambda;

import functionalInterfaces.GreetingService;

public class WhenLambdaExecuted {

    public static void main(String[] args) {
        System.out.println("Start execution");

        receiveNumber(getNumber());

//        test(s->{
//            System.out.println("Inside lambda");
//            return s.toUpperCase();
//        });

        System.out.println("Ending execution");

    }

    private static int getNumber(){
        System.out.println("Called getNumber");
        return  5;
    }

    private static void receiveNumber(int i){
        System.out.println("Received number is :: "+ i);
    }

//    private static void test(GreetingService g){
//        System.out.println("Inside test method. Received greeting service");
//        String returnedString = g.greet("sfl");
//        System.out.println(returnedString);
//    }
}
