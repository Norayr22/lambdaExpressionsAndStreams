package functionalInterfaces;

@FunctionalInterface  //SAM
public interface GreetingService {
//    void greet(String name);

//    void greet(String firstName, String lastName, int age);
    String greet(String firstName);
}
