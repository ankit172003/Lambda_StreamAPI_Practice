package streamAPI;

import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

//        Older way
//        Walkable obj = new WalkFast();
//        obj.walk(4);

//        Walkable obj = new Walkable() {
//            @Override
//            public int walk(int steps) {
//                return 0;
//            }
//        };

//        Walkable obj = (steps, isEnabled) -> {
//            System.out.println("Walking fast "+ steps + " steps. ");
//            return 2*steps;
//        };
//
//        Walkable obj2 = (steps, isEnabled) -> 2*steps;
//
//        obj.walk(4, true);

        List<String> fruits = List.of("Apple", "Banana", "Kiwi");

        Stream<String> stream = fruits.stream();

//        stream.forEach((fruit) -> {
//            System.out.println(fruit);
//        });

        stream
                .sorted()
                .map(fruit -> fruit.length())
                .forEach(fruit -> System.out.println(fruit));


    }
}

// has exact one function
//@FunctionalInterface
interface Walkable{
      int walk(int steps, boolean isEnabled);
}


//class WalkFast implements Walkable{
//
//    @Override
//    public int walk(int steps) {
//        System.out.println("Walking fast "+ steps + " steps. ");
//        return 2*steps;
//    }
//}