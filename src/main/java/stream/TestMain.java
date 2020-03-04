package stream;

import java.util.ArrayList;
import java.util.List;

public class TestMain {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(8); //for sort method
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
//        list.add(8);
        list.add(9);

        //check for even numbers
        // interested is only 3 elements
        // find the square
        // print it o the console one by one -new line

//        list.stream()
//                .limit(3)
//                .filter(i->i%2 ==0)
//                .map(i-> i*i)
//                .forEach(System.out::println);
//################################################################################
//        list.stream()                                                    //how stream works
//                .filter(i->{
//                    System.out.println("filter-received :: "+ i);
//                    return i%2 ==0;
//                })
//                .limit(3)
//                .map(i->{
//                    System.out.println("map-received :: "+ i);
//                    return i * i;
//                })
//                .forEach(i-> System.out.println(i));

//################################################################################

//        System.out.println("starting");                                            //  laziness check
//        list.stream()
//                .filter(i->{
//                    System.out.println("filter-received :: "+ i);
//                    return i%2 ==0;
//                })
//                .limit(3)
//                .map(i->{
//                    System.out.println("map-received :: "+ i);
//                    return i * i;
//                })
//                .forEach(i-> System.out.println(i));
//        System.out.println("ending");

// ##################################################################################

//        System.out.println("starting");                                      //sorted check
//        list.stream()
//                .filter(i->{
//                    System.out.println("filter-received :: "+ i);
//                    return i%2 ==0;
//                })
//                .limit(3) //8 ,2 ,4 => 2, 4 , 8
//                .sorted()
//                .map(i->{
//                    System.out.println("map-received :: "+ i);
//                    return i * i;
//                })
//                .forEach(i-> System.out.println(i));
//        System.out.println("ending");
//##########################################################################
//
//        list.stream()
//                .peek(i-> System.out.println("filter-received :: " +i))          //peek
//                .filter(i->i%2 ==0)
//                .limit(3)
//                .peek(i-> System.out.println("ed :: " +i))
//                .sorted()
//                .peek(i-> System.out.println("map-received :: " +i))
//                .map(i-> i*i)
//                .forEach(System.out::println);

//###############################################################################

        list.stream()
                .skip(4)                                                    //skip
                .peek(i -> System.out.println("filter-received :: " + i))
                .filter(i -> i % 2 == 0)
                .limit(3)
                .peek(i -> System.out.println("map-received :: " + i))

                .map(i -> i * i)
                .forEach(System.out::println);

    }


}
