package lambda;

import java.util.function.Supplier;

public class SupplierFunctionalInterface {
    public static void main(String[] args) {
        Supplier<Integer> random = ()->(int)(Math.random()+5);
        System.out.println(random.get());
    }
}
