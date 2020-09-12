import java.util.ArrayList;
import java.util.List;

/**
 * @author Lhouceine OUHAMZA
 */

public class App {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>(); // list of animals
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("turtle", false, true));
        
        // with lambda we no longer need classes that implements CheckTrait
        print(animals,  a -> a.canHop()); // pass class that does check
        print(animals,  a -> a.canSwim()); // pass class that does check
    }

    private static void print(List<Animal> animals, CheckTrait checker) {
        for (Animal animal : animals) {
            if (checker.test(animal)) // the general check
                System.out.println(animal + " ");
        }
        System.out.println();
    }

}
