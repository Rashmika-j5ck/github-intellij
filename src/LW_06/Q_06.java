package LW_06;
import java.util.*;


public class Q_06 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Cat> cats = new ArrayList<>();
        ArrayList<Dog> dogs = new ArrayList<>();

        while (true) {
            System.out.println("\n1. Add Cat");
            System.out.println("2. Add Dog");
            System.out.println("3. Remove Cat");
            System.out.println("4. Remove Dog");
            System.out.println("0. Quit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> {
                    Cat cat = new Cat();
                    System.out.print("Enter cat name: ");
                    cat.setName(sc.nextLine());
                    System.out.print("Enter coat color: ");
                    cat.setCoatColor(sc.nextLine());
                    cats.add(cat);
                }
                case 2 -> {
                    Dog dog = new Dog();
                    System.out.print("Enter dog name: ");
                    dog.setName(sc.nextLine());
                    System.out.print("Enter weight: ");
                    dog.setWeight(sc.nextDouble());
                    sc.nextLine();
                    dogs.add(dog);
                }
                case 3 -> {
                    System.out.print("Enter cat name to remove: ");
                    String name = sc.nextLine();
                    cats.removeIf(cat -> cat.getName().equalsIgnoreCase(name));
                }
                case 4 -> {
                    System.out.print("Enter dog name to remove: ");
                    String name = sc.nextLine();
                    dogs.removeIf(dog -> dog.getName().equalsIgnoreCase(name));
                }
                case 0 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice!");
            }

            System.out.println("\nCurrent Pets:");
            System.out.println("Cats:");
            for (Cat c : cats)
                System.out.println("- " + c.getName() + " (" + c.getCoatColor() + ")");
            System.out.println("Dogs:");
            for (Dog d : dogs)
                System.out.println("- " + d.getName() + " (" + d.getWeight() + "kg)");
        }
    }
}
