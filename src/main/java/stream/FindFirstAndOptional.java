package stream;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FindFirstAndOptional {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("apple");
        list.add("ball");
        list.add("cat");
        list.add("dog");


        System.out.println(
                list.stream()
                        .filter(s->s.length()>3)
                        .findFirst()
                        .get()
        );

//
//        Optional<String> op = list.stream()
//                .filter(s -> s.length() > 3)
//                .findFirst();
////
//        if(op.isPresent()){
//            System.out.println(op.get());
//        }

//                list.stream()
//                        .filter(s->s.length()>10)
//                        .forEach(s-> System.out.println(s));

    }
}
