package LW_06;



    import java.util.*;

    public class Q_02 {
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
                sc.nextLine(); // consume newline

                Pet pet;
                if (type == 'c') {
                    pet = new Cat();
                } else if (type == 'd') {
                    pet = new Dog();
                } else {
                    System.out.println("Invalid type! Skipping...");
                    continue;
                }
                pet.setName(name);
                pets.add(pet);
            }

            System.out.println("\nPet List:");
            for (Pet pet : pets) {
                System.out.println(pet.getName() + " - " + pet.getClass().getSimpleName());
            }
        }
    }

