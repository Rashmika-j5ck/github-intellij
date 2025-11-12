package LW_06;
import java.util.*;


public class Q_05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Pet> pets = new ArrayList<>();

        while (true) {
            System.out.print("Enter pet name (STOP to end): ");
            String name = sc.nextLine();
            if (name.equalsIgnoreCase("STOP")) break;

            System.out.print("Enter type (c for cat, d for dog): ");
            char type = sc.next().charAt(0);
            sc.nextLine();

            if (type == 'd') {
                Dog dog = new Dog();
                dog.setName(name);
                System.out.print("Enter weight: ");
                dog.setWeight(sc.nextDouble());
                sc.nextLine();
                pets.add(dog);
            } else {
                Cat cat = new Cat();
                cat.setName(name);
                pets.add(cat);
            }
        }

        // Create dog array
        ArrayList<Dog> dogs = new ArrayList<>();
        for (Pet pet : pets)
            if (pet instanceof Dog)
                dogs.add((Dog) pet);

        if (dogs.isEmpty()) {
            System.out.println("No dogs entered!");
            return;
        }

        double total = 0, min = dogs.get(0).getWeight(), max = dogs.get(0).getWeight();
        for (Dog d : dogs) {
            double w = d.getWeight();
            total += w;
            if (w < min) min = w;
            if (w > max) max = w;
        }

        double avg = total / dogs.size();
        System.out.println("\nDog Weight Stats:");
        System.out.println("Average: " + avg);
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
}
    }