package LW_06;
import java.util.*;


public class Q_03 {


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

            Pet pet = (type == 'c') ? new Cat() : new Dog();
            pet.setName(name);
            pets.add(pet);
        }

        System.out.println("\nCats:");
        for (Pet pet : pets)
            if (pet instanceof Cat)
                System.out.println(pet.getName());

        System.out.println("\nDogs:");
        for (Pet pet : pets)
            if (pet instanceof Dog)
                System.out.println(pet.getName());
    }
}
