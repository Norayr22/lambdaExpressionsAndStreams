package lambda;

import functionalInterfaces.GreetingService;

import java.util.ArrayList;
import java.util.List;

public class TestMain {

    public static void main(String[] args) {
//        GreetingService g = (tytty)-> System.out.println("Hello "+ tytty);
//
////
//        g.greet(5);
//-------------------------------------------------------------------
//        GreetingService g1 =  (String name)-> {
//                System.out.println("Hello "+ name);
//
//        };
//-------------------------------------------------------------------
//        GreetingService g2 =  (name)-> System.out.println("Hello "+ name);
//        g.greet("Norayr");
//-------------------------------------------------------------------
//        GreetingService g1 =  (String name)-> {
//                System.out.println("Hello "+ name);
//                System.out.println("length is "+name.length());
//        };
//
//        g1.greet("SFL");
//-------------------------------------------------------------------
//          GreetingService g1 =  ( fn, ln, age)-> {
//                System.out.println("My Name is "+ fn + " " +ln);
//                System.out.println("My age is "+age);
//          };
//
//            g1.greet("Norayr","Sargsyan",28);
//        }
//-------------------------------------------------------------------
//        GreetingService g = (firstName)->firstName.toUpperCase();
//
//        System.out.println(g.greet("norayr"));

//----------------------------------------------------------
//        GreetingService g = n->n.toUpperCase();  //pure function
//        System.out.println("norayr");
//-------------------------------------------------------------------
//        List<String> list = new ArrayList<>();
//        list.add("abc");
//        list.add("fgh");
//
//        GreetingService g5 = n->n.toUpperCase()+list.get(1); //shared state
//        System.out.println(g5.greet("norayr"));
////----------------------------------------------------------------------
//        List<String> list1 = new ArrayList<>();
//        list.add("abc");
//        list.add("fgh");
//        GreetingService g6 = n->n.toUpperCase()+list.get(1); //shared state
//
//        GreetingService g7 = n->{
//                list.remove(1);
//                return n.toUpperCase();
//        }; //side-effects

    }
}


