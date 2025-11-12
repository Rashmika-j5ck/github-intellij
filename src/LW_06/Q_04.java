package LW_06;
import java.util.*;


public class Q_04 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Pet> pets = new ArrayList<>();

        while (true) {
            System.out.print("Enter pet name (STOP to end): ");
            String name = sc.nextLine();
            if (name.equalsIgnoreCase("STOP"))
                break;

            System.out.print("Enter type (c for cat, d for dog): ");
            char type = sc.next().charAt(0);
            sc.nextLine();

            if (type == 'c') {
                Cat cat = new Cat();
                cat.setName(name);
                System.out.print("Enter coat color: ");
                cat.setCoatColor(sc.nextLine());
                pets.add(cat);
            } else if (type == 'd') {
                Dog dog = new Dog();
                dog.setName(name);
                System.out.print("Enter weight: ");
                dog.setWeight(sc.nextDouble());
                sc.nextLine();
                pets.add(dog);
            }
        }

        System.out.println("\nCats:");
        for (Pet pet : pets)
            if (pet instanceof Cat)
                System.out.println(pet.getName() + " | Coat Color: " + ((Cat) pet).getCoatColor());

        System.out.println("\nDogs:");
        for (Pet pet : pets)
            if (pet instanceof Dog)
                System.out.println(pet.getName() + " | Weight: " + ((Dog) pet).getWeight());
    }
}
