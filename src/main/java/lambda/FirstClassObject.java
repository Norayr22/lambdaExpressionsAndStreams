package lambda;

import functionalInterfaces.GreetingService;

public class FirstClassObject {

    public static void main(String[] args) {
                            //reference type
        GreetingService g = n->n.toUpperCase(); //assigning a function to a variable this is first class object
    }
}
