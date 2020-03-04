package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerFunctionalInterface {
    public static void main(String[] args) {
//        Consumer<String> c1 = c-> System.out.println(c);
//        c1.accept("sfl");

        //consumer chaining  //consumer chaining can happened if they are the same type

        List<String> list = new ArrayList<>();
        list.add("Norayr");
        list.add("Sargsyan");

        Consumer<String> dbConsumer = s->{
            System.out.println("I am writing into DB :: "+s);
        };

        Consumer<String> logingConsumer = s->{
            System.out.println("I am writing log fiel :: "+s);
        };

        Consumer<String> dbLogConsumer = dbConsumer.andThen(logingConsumer).andThen(dbConsumer);

        dbLogConsumer.accept(list.get(0));
//
        list.forEach(dbLogConsumer);
    }
}
