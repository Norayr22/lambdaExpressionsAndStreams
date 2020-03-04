package lambda;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class BiConsumerFunctionalInterface {

    public static void main(String[] args) {

//        BiConsumer<String, Integer> biConsumer = (s,i)->{
//            System.out.println("My name is :: "+ s);
//            System.out.println("My age is :: "+ i);
//        };
//
//
//
//        biConsumer.accept("Norayr",28);


        Map<String, String> map = new HashMap<>();

        map.put("db","dbConsumer");
        map.put("log","logConsumer");
        map.put("dbLog","dbLogConsumer");

        map.forEach((k,v)->{
            System.out.println("key is :: "+k);
            System.out.println("key is :: "+v);
        });
//biConsumer can not be chain another biConsumer
    }


}
